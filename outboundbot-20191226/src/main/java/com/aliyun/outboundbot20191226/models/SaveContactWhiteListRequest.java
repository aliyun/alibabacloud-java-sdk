// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveContactWhiteListRequest extends TeaModel {
    /**
     * <p>The contact whitelist. This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ContactWhiteListList")
    public java.util.List<String> contactWhiteListList;

    /**
     * <p>The whitelist. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;phoneNumber&quot;:&quot;132322&quot;,&quot;remark&quot;:&quot;123321&quot;,&quot;name&quot;:&quot;ccc1&quot;,&quot;creator&quot;:&quot;ccc222&quot;}]</p>
     */
    @NameInMap("ContactWhiteListsJson")
    public String contactWhiteListsJson;

    /**
     * <p>The instance ID. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c415bb6c-2e6f-46aa-afd9-3b65b6dbe2bc</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static SaveContactWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveContactWhiteListRequest self = new SaveContactWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public SaveContactWhiteListRequest setContactWhiteListList(java.util.List<String> contactWhiteListList) {
        this.contactWhiteListList = contactWhiteListList;
        return this;
    }
    public java.util.List<String> getContactWhiteListList() {
        return this.contactWhiteListList;
    }

    public SaveContactWhiteListRequest setContactWhiteListsJson(String contactWhiteListsJson) {
        this.contactWhiteListsJson = contactWhiteListsJson;
        return this;
    }
    public String getContactWhiteListsJson() {
        return this.contactWhiteListsJson;
    }

    public SaveContactWhiteListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
