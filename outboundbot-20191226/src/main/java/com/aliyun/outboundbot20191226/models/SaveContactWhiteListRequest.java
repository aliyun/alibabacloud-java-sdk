// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveContactWhiteListRequest extends TeaModel {
    @NameInMap("ContactWhiteListList")
    public java.util.List<String> contactWhiteListList;

    @NameInMap("ContactWhiteListsJson")
    public String contactWhiteListsJson;

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
