// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DataInstancesValue extends TeaModel {
    /**
     * <p>The DNS name.</p>
     * 
     * <strong>example:</strong>
     * <p>nlb-wb7r6dlwetvt5j****.cn-hangzhou.nlb.aliyuncs.com</p>
     */
    @NameInMap("DnsName")
    public String dnsName;

    /**
     * <p>A collection of listener details.</p>
     */
    @NameInMap("Listeners")
    public java.util.Map<String, DataInstancesValueListenersValue> listeners;

    /**
     * <p>Indicates whether SAE created the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: SAE created the instance.</p>
     * </li>
     * <li><p><strong>false</strong>: SAE reused an existing instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CreatedBySae")
    public Boolean createdBySae;

    public static DataInstancesValue build(java.util.Map<String, ?> map) throws Exception {
        DataInstancesValue self = new DataInstancesValue();
        return TeaModel.build(map, self);
    }

    public DataInstancesValue setDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }
    public String getDnsName() {
        return this.dnsName;
    }

    public DataInstancesValue setListeners(java.util.Map<String, DataInstancesValueListenersValue> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.Map<String, DataInstancesValueListenersValue> getListeners() {
        return this.listeners;
    }

    public DataInstancesValue setCreatedBySae(Boolean createdBySae) {
        this.createdBySae = createdBySae;
        return this;
    }
    public Boolean getCreatedBySae() {
        return this.createdBySae;
    }

}
