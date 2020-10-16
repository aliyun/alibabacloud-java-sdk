// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateMonitorRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("DeviceOperateType")
    public String deviceOperateType;

    @NameInMap("DeviceList")
    public String deviceList;

    @NameInMap("PicOperateType")
    public String picOperateType;

    @NameInMap("PicList")
    public String picList;

    @NameInMap("AttributeOperateType")
    public String attributeOperateType;

    @NameInMap("AttributeName")
    public String attributeName;

    @NameInMap("AttributeValueList")
    public String attributeValueList;

    @NameInMap("Description")
    public String description;

    @NameInMap("RuleExpression")
    public String ruleExpression;

    @NameInMap("AlgorithmVendor")
    @Validation(required = true)
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

    public static UpdateMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMonitorRequest self = new UpdateMonitorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMonitorRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public UpdateMonitorRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateMonitorRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateMonitorRequest setDeviceOperateType(String deviceOperateType) {
        this.deviceOperateType = deviceOperateType;
        return this;
    }
    public String getDeviceOperateType() {
        return this.deviceOperateType;
    }

    public UpdateMonitorRequest setDeviceList(String deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public String getDeviceList() {
        return this.deviceList;
    }

    public UpdateMonitorRequest setPicOperateType(String picOperateType) {
        this.picOperateType = picOperateType;
        return this;
    }
    public String getPicOperateType() {
        return this.picOperateType;
    }

    public UpdateMonitorRequest setPicList(String picList) {
        this.picList = picList;
        return this;
    }
    public String getPicList() {
        return this.picList;
    }

    public UpdateMonitorRequest setAttributeOperateType(String attributeOperateType) {
        this.attributeOperateType = attributeOperateType;
        return this;
    }
    public String getAttributeOperateType() {
        return this.attributeOperateType;
    }

    public UpdateMonitorRequest setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public UpdateMonitorRequest setAttributeValueList(String attributeValueList) {
        this.attributeValueList = attributeValueList;
        return this;
    }
    public String getAttributeValueList() {
        return this.attributeValueList;
    }

    public UpdateMonitorRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMonitorRequest setRuleExpression(String ruleExpression) {
        this.ruleExpression = ruleExpression;
        return this;
    }
    public String getRuleExpression() {
        return this.ruleExpression;
    }

    public UpdateMonitorRequest setAlgorithmVendor(String algorithmVendor) {
        this.algorithmVendor = algorithmVendor;
        return this;
    }
    public String getAlgorithmVendor() {
        return this.algorithmVendor;
    }

    public UpdateMonitorRequest setNotifierType(String notifierType) {
        this.notifierType = notifierType;
        return this;
    }
    public String getNotifierType() {
        return this.notifierType;
    }

    public UpdateMonitorRequest setNotifierUrl(String notifierUrl) {
        this.notifierUrl = notifierUrl;
        return this;
    }
    public String getNotifierUrl() {
        return this.notifierUrl;
    }

    public UpdateMonitorRequest setNotifierAppSecret(String notifierAppSecret) {
        this.notifierAppSecret = notifierAppSecret;
        return this;
    }
    public String getNotifierAppSecret() {
        return this.notifierAppSecret;
    }

    public UpdateMonitorRequest setNotifierTimeOut(Integer notifierTimeOut) {
        this.notifierTimeOut = notifierTimeOut;
        return this;
    }
    public Integer getNotifierTimeOut() {
        return this.notifierTimeOut;
    }

    public UpdateMonitorRequest setNotifierExtendValues(String notifierExtendValues) {
        this.notifierExtendValues = notifierExtendValues;
        return this;
    }
    public String getNotifierExtendValues() {
        return this.notifierExtendValues;
    }

}
