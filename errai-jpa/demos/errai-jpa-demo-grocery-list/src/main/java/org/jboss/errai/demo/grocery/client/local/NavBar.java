package org.jboss.errai.demo.grocery.client.local;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import org.jboss.errai.ui.client.widget.LocaleListBox;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.inject.Inject;

@Templated
public class NavBar extends Composite {

  @Inject @DataField Anchor home;
  @Inject @DataField Anchor items;
  @Inject @DataField Anchor stores;
  @Inject @DataField LocaleListBox language;

  @Inject TransitionTo<WelcomePage> homeTab;
  @Inject TransitionTo<StoresPage> storesTab;
  @Inject TransitionTo<ItemListPage> itemsTab;

  @EventHandler("home")
  public void onHomeButtonClick(ClickEvent e) {
    homeTab.go();
  }

  @EventHandler("items")
  public void onItemsButtonClick(ClickEvent e) {
    itemsTab.go();
  }

  @EventHandler("stores")
  public void onStoresButtonClick(ClickEvent e) {
    storesTab.go();
  }
}
