// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetEtlMetaRequest extends TeaModel {
    @NameInMap("etlMetaKey")
    public String etlMetaKey;

    @NameInMap("etlMetaName")
    public String etlMetaName;

    @NameInMap("etlMetaTag")
    public String etlMetaTag;

    public static GetEtlMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEtlMetaRequest self = new GetEtlMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetEtlMetaRequest setEtlMetaKey(String etlMetaKey) {
        this.etlMetaKey = etlMetaKey;
        return this;
    }
    public String getEtlMetaKey() {
        return this.etlMetaKey;
    }

    public GetEtlMetaRequest setEtlMetaName(String etlMetaName) {
        this.etlMetaName = etlMetaName;
        return this;
    }
    public String getEtlMetaName() {
        return this.etlMetaName;
    }

    public GetEtlMetaRequest setEtlMetaTag(String etlMetaTag) {
        this.etlMetaTag = etlMetaTag;
        return this;
    }
    public String getEtlMetaTag() {
        return this.etlMetaTag;
    }

}
