// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveContactBlockListRequest extends TeaModel {
    /**
     * <p>The list of contacts. [Deprecated]</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("ContactBlockListList")
    public java.util.List<String> contactBlockListList;

    /**
     * <p>A JSON string that contains the blocklist. This parameter is required.</p>
     * <ul>
     * <li><p>phoneNumber: The mobile phone number.</p>
     * </li>
     * <li><p>remark: The remarks.</p>
     * </li>
     * <li><p>name: The name.</p>
     * </li>
     * <li><p>creator: The creator.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;phoneNumber&quot;:&quot;132322&quot;,&quot;remark&quot;:&quot;123321&quot;,&quot;name&quot;:&quot;ccc1&quot;,&quot;creator&quot;:&quot;ccc222&quot;}]</p>
     */
    @NameInMap("ContactBlockListsJson")
    public String contactBlockListsJson;

    /**
     * <p>The instance ID. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c3c92de8-e4bd-4db4-a962-50f8acce40bc</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static SaveContactBlockListRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveContactBlockListRequest self = new SaveContactBlockListRequest();
        return TeaModel.build(map, self);
    }

    public SaveContactBlockListRequest setContactBlockListList(java.util.List<String> contactBlockListList) {
        this.contactBlockListList = contactBlockListList;
        return this;
    }
    public java.util.List<String> getContactBlockListList() {
        return this.contactBlockListList;
    }

    public SaveContactBlockListRequest setContactBlockListsJson(String contactBlockListsJson) {
        this.contactBlockListsJson = contactBlockListsJson;
        return this;
    }
    public String getContactBlockListsJson() {
        return this.contactBlockListsJson;
    }

    public SaveContactBlockListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
