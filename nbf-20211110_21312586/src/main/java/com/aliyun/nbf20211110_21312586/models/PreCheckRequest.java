// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20211110_21312586.models;

import com.aliyun.tea.*;

public class PreCheckRequest extends TeaModel {
    @NameInMap("apiSchemaDTO")
    public java.io.InputStream apiSchemaDTO;

    @NameInMap("groupVersionExtraInfo")
    public java.io.InputStream groupVersionExtraInfo;

    @NameInMap("namespaceExternalId")
    public java.io.InputStream namespaceExternalId;

    public static PreCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        PreCheckRequest self = new PreCheckRequest();
        return TeaModel.build(map, self);
    }

    public PreCheckRequest setApiSchemaDTO(java.io.InputStream apiSchemaDTO) {
        this.apiSchemaDTO = apiSchemaDTO;
        return this;
    }
    public java.io.InputStream getApiSchemaDTO() {
        return this.apiSchemaDTO;
    }

    public PreCheckRequest setGroupVersionExtraInfo(java.io.InputStream groupVersionExtraInfo) {
        this.groupVersionExtraInfo = groupVersionExtraInfo;
        return this;
    }
    public java.io.InputStream getGroupVersionExtraInfo() {
        return this.groupVersionExtraInfo;
    }

    public PreCheckRequest setNamespaceExternalId(java.io.InputStream namespaceExternalId) {
        this.namespaceExternalId = namespaceExternalId;
        return this;
    }
    public java.io.InputStream getNamespaceExternalId() {
        return this.namespaceExternalId;
    }

}
