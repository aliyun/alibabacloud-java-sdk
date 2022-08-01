// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class BatchModifyEtlMetaStatusRequest extends TeaModel {
    @NameInMap("etlMetaKeyList")
    public java.util.List<String> etlMetaKeyList;

    @NameInMap("etlMetaName")
    public String etlMetaName;

    @NameInMap("etlMetaTag")
    public String etlMetaTag;

    @NameInMap("range")
    public String range;

    @NameInMap("type")
    public String type;

    public static BatchModifyEtlMetaStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchModifyEtlMetaStatusRequest self = new BatchModifyEtlMetaStatusRequest();
        return TeaModel.build(map, self);
    }

    public BatchModifyEtlMetaStatusRequest setEtlMetaKeyList(java.util.List<String> etlMetaKeyList) {
        this.etlMetaKeyList = etlMetaKeyList;
        return this;
    }
    public java.util.List<String> getEtlMetaKeyList() {
        return this.etlMetaKeyList;
    }

    public BatchModifyEtlMetaStatusRequest setEtlMetaName(String etlMetaName) {
        this.etlMetaName = etlMetaName;
        return this;
    }
    public String getEtlMetaName() {
        return this.etlMetaName;
    }

    public BatchModifyEtlMetaStatusRequest setEtlMetaTag(String etlMetaTag) {
        this.etlMetaTag = etlMetaTag;
        return this;
    }
    public String getEtlMetaTag() {
        return this.etlMetaTag;
    }

    public BatchModifyEtlMetaStatusRequest setRange(String range) {
        this.range = range;
        return this;
    }
    public String getRange() {
        return this.range;
    }

    public BatchModifyEtlMetaStatusRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
