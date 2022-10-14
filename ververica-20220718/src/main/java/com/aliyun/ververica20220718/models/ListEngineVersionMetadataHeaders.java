// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListEngineVersionMetadataHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("workspace")
    public String workspace;

    public static ListEngineVersionMetadataHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListEngineVersionMetadataHeaders self = new ListEngineVersionMetadataHeaders();
        return TeaModel.build(map, self);
    }

    public ListEngineVersionMetadataHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListEngineVersionMetadataHeaders setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
