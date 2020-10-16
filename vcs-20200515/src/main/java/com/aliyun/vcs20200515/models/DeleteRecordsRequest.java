// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteRecordsRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("AlgorithmType")
    public String algorithmType;

    @NameInMap("AttributeName")
    public String attributeName;

    @NameInMap("OperatorType")
    public String operatorType;

    @NameInMap("Value")
    public String value;

    public static DeleteRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecordsRequest self = new DeleteRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRecordsRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public DeleteRecordsRequest setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    public DeleteRecordsRequest setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public DeleteRecordsRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public DeleteRecordsRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
