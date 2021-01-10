// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveClriskTemplateRequest extends TeaModel {
    @NameInMap("DataNodesRepeatList")
    public java.util.List<String> dataNodesRepeatList;

    @NameInMap("Memo")
    public String memo;

    @NameInMap("OwnersRepeatList")
    public java.util.List<String> ownersRepeatList;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TriggerDelay")
    public String triggerDelay;

    @NameInMap("TriggerMode")
    public String triggerMode;

    public static SaveClriskTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveClriskTemplateRequest self = new SaveClriskTemplateRequest();
        return TeaModel.build(map, self);
    }

    public SaveClriskTemplateRequest setDataNodesRepeatList(java.util.List<String> dataNodesRepeatList) {
        this.dataNodesRepeatList = dataNodesRepeatList;
        return this;
    }
    public java.util.List<String> getDataNodesRepeatList() {
        return this.dataNodesRepeatList;
    }

    public SaveClriskTemplateRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public SaveClriskTemplateRequest setOwnersRepeatList(java.util.List<String> ownersRepeatList) {
        this.ownersRepeatList = ownersRepeatList;
        return this;
    }
    public java.util.List<String> getOwnersRepeatList() {
        return this.ownersRepeatList;
    }

    public SaveClriskTemplateRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public SaveClriskTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SaveClriskTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public SaveClriskTemplateRequest setTriggerDelay(String triggerDelay) {
        this.triggerDelay = triggerDelay;
        return this;
    }
    public String getTriggerDelay() {
        return this.triggerDelay;
    }

    public SaveClriskTemplateRequest setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }
    public String getTriggerMode() {
        return this.triggerMode;
    }

}
