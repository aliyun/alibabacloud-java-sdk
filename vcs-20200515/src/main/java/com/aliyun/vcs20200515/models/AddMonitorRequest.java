// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddMonitorRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("MonitorType")
    public String monitorType;

    @NameInMap("Description")
    public String description;

    @NameInMap("BatchIndicator")
    public Integer batchIndicator;

    @NameInMap("AlgorithmVendor")
    public String algorithmVendor;

    @NameInMap("NotifierType")
    public String notifierType;

    @NameInMap("NotifierUrl")
    public String notifierUrl;

    @NameInMap("NotifierAppSecret")
    public String notifierAppSecret;

    @NameInMap("NotifierTimeOut")
    public Integer notifierTimeOut;

    @NameInMap("NotifierExtendValues")
    public String notifierExtendValues;

    public static AddMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMonitorRequest self = new AddMonitorRequest();
        return TeaModel.build(map, self);
    }

    public AddMonitorRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public AddMonitorRequest setMonitorType(String monitorType) {
        this.monitorType = monitorType;
        return this;
    }
    public String getMonitorType() {
        return this.monitorType;
    }

    public AddMonitorRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddMonitorRequest setBatchIndicator(Integer batchIndicator) {
        this.batchIndicator = batchIndicator;
        return this;
    }
    public Integer getBatchIndicator() {
        return this.batchIndicator;
    }

    public AddMonitorRequest setAlgorithmVendor(String algorithmVendor) {
        this.algorithmVendor = algorithmVendor;
        return this;
    }
    public String getAlgorithmVendor() {
        return this.algorithmVendor;
    }

    public AddMonitorRequest setNotifierType(String notifierType) {
        this.notifierType = notifierType;
        return this;
    }
    public String getNotifierType() {
        return this.notifierType;
    }

    public AddMonitorRequest setNotifierUrl(String notifierUrl) {
        this.notifierUrl = notifierUrl;
        return this;
    }
    public String getNotifierUrl() {
        return this.notifierUrl;
    }

    public AddMonitorRequest setNotifierAppSecret(String notifierAppSecret) {
        this.notifierAppSecret = notifierAppSecret;
        return this;
    }
    public String getNotifierAppSecret() {
        return this.notifierAppSecret;
    }

    public AddMonitorRequest setNotifierTimeOut(Integer notifierTimeOut) {
        this.notifierTimeOut = notifierTimeOut;
        return this;
    }
    public Integer getNotifierTimeOut() {
        return this.notifierTimeOut;
    }

    public AddMonitorRequest setNotifierExtendValues(String notifierExtendValues) {
        this.notifierExtendValues = notifierExtendValues;
        return this;
    }
    public String getNotifierExtendValues() {
        return this.notifierExtendValues;
    }

}
