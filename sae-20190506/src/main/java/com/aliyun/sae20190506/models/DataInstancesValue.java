// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DataInstancesValue extends TeaModel {
    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>nlb-wb7r6dlwetvt5j****.cn-hangzhou.nlb.aliyuncs.com</p>
     */
    @NameInMap("DnsName")
    public String dnsName;

    /**
     * <p>The listeners.</p>
     */
    @NameInMap("Listeners")
    public java.util.Map<String, DataInstancesValueListenersValue> listeners;

    /**
     * <p>Indicates whether the instance is created by SAE.</p>
     * <ul>
     * <li><strong>true</strong>: The instance is created by SAE.</li>
     * <li><strong>false</strong>: The existing instance is reused.</li>
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
