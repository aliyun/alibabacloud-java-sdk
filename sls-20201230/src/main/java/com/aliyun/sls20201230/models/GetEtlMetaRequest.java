// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetEtlMetaRequest extends TeaModel {
    @NameInMap("elMetaName")
    public String elMetaName;

    @NameInMap("etlMetaKey")
    public String etlMetaKey;

    @NameInMap("etlMetaTag")
    public String etlMetaTag;

    public static GetEtlMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEtlMetaRequest self = new GetEtlMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetEtlMetaRequest setElMetaName(String elMetaName) {
        this.elMetaName = elMetaName;
        return this;
    }
    public String getElMetaName() {
        return this.elMetaName;
    }

    public GetEtlMetaRequest setEtlMetaKey(String etlMetaKey) {
        this.etlMetaKey = etlMetaKey;
        return this;
    }
    public String getEtlMetaKey() {
        return this.etlMetaKey;
    }

    public GetEtlMetaRequest setEtlMetaTag(String etlMetaTag) {
        this.etlMetaTag = etlMetaTag;
        return this;
    }
    public String getEtlMetaTag() {
        return this.etlMetaTag;
    }

}
