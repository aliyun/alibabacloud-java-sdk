// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveContactWhiteListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ContactWhiteListList")
    public java.util.List<String> contactWhiteListList;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ContactWhiteListsJson")
    public String contactWhiteListsJson;

    /**
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
