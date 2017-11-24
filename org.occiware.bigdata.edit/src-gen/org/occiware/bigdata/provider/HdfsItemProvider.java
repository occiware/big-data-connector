/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.occiware.bigdata.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.cmf.occi.core.provider.MixinBaseItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.occiware.bigdata.BigdataPackage;
import org.occiware.bigdata.Hdfs;

/**
 * This is the item provider adapter for a {@link org.occiware.bigdata.Hdfs} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HdfsItemProvider extends MixinBaseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HdfsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOcciwareBigdataUiPortPropertyDescriptor(object);
			addOcciwareBigdataDataNodesIpPropertyDescriptor(object);
			addOcciwareBigdataInstanceNamePropertyDescriptor(object);
			addOcciwareBigdataMasterNodePortPropertyDescriptor(object);
			addOcciwareBigdataMasterNodeIpPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Occiware Bigdata Ui Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOcciwareBigdataUiPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hdfs_occiwareBigdataUiPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hdfs_occiwareBigdataUiPort_feature", "_UI_Hdfs_type"),
				 BigdataPackage.Literals.HDFS__OCCIWARE_BIGDATA_UI_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Occiware Bigdata Data Nodes Ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOcciwareBigdataDataNodesIpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hdfs_occiwareBigdataDataNodesIp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hdfs_occiwareBigdataDataNodesIp_feature", "_UI_Hdfs_type"),
				 BigdataPackage.Literals.HDFS__OCCIWARE_BIGDATA_DATA_NODES_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Occiware Bigdata Instance Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOcciwareBigdataInstanceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hdfs_occiwareBigdataInstanceName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hdfs_occiwareBigdataInstanceName_feature", "_UI_Hdfs_type"),
				 BigdataPackage.Literals.HDFS__OCCIWARE_BIGDATA_INSTANCE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Occiware Bigdata Master Node Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOcciwareBigdataMasterNodePortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hdfs_occiwareBigdataMasterNodePort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hdfs_occiwareBigdataMasterNodePort_feature", "_UI_Hdfs_type"),
				 BigdataPackage.Literals.HDFS__OCCIWARE_BIGDATA_MASTER_NODE_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Occiware Bigdata Master Node Ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOcciwareBigdataMasterNodeIpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hdfs_occiwareBigdataMasterNodeIp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hdfs_occiwareBigdataMasterNodeIp_feature", "_UI_Hdfs_type"),
				 BigdataPackage.Literals.HDFS__OCCIWARE_BIGDATA_MASTER_NODE_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Hdfs.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Hdfs"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Hdfs)object).getOcciwareBigdataInstanceName();
		return label == null || label.length() == 0 ?
			getString("_UI_Hdfs_type") :
			getString("_UI_Hdfs_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Hdfs.class)) {
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_UI_PORT:
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_DATA_NODES_IP:
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_INSTANCE_NAME:
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_MASTER_NODE_PORT:
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_MASTER_NODE_IP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BigdataEditPlugin.INSTANCE;
	}

}
