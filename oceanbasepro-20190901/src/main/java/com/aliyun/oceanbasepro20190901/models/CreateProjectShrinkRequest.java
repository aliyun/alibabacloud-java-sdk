// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateProjectShrinkRequest extends TeaModel {
    @NameInMap("CommonTransferConfig")
    public String commonTransferConfigShrink;

    @NameInMap("EnableFullTransfer")
    public Boolean enableFullTransfer;

    @NameInMap("EnableFullVerify")
    public Boolean enableFullVerify;

    @NameInMap("EnableIncrTransfer")
    public Boolean enableIncrTransfer;

    @NameInMap("EnableReverseIncrTransfer")
    public Boolean enableReverseIncrTransfer;

    @NameInMap("EnableStructTransfer")
    public Boolean enableStructTransfer;

    @NameInMap("FullTransferConfig")
    public String fullTransferConfigShrink;

    @NameInMap("Id")
    public String id;

    @NameInMap("IncrTransferConfig")
    public String incrTransferConfigShrink;

    @NameInMap("LabelIds")
    public String labelIdsShrink;

    @NameInMap("Name")
    public String name;

    @NameInMap("OssKey")
    public String ossKey;

    @NameInMap("SinkEndpointId")
    public String sinkEndpointId;

    @NameInMap("SourceEndpointId")
    public String sourceEndpointId;

    @NameInMap("StructTransferConfig")
    public String structTransferConfigShrink;

    @NameInMap("TransferMapping")
    public String transferMappingShrink;

    @NameInMap("Type")
    public String type;

    @NameInMap("UseOss")
    public Boolean useOss;

    @NameInMap("WorkerGradeId")
    public String workerGradeId;

    public static CreateProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectShrinkRequest self = new CreateProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectShrinkRequest setCommonTransferConfigShrink(String commonTransferConfigShrink) {
        this.commonTransferConfigShrink = commonTransferConfigShrink;
        return this;
    }
    public String getCommonTransferConfigShrink() {
        return this.commonTransferConfigShrink;
    }

    public CreateProjectShrinkRequest setEnableFullTransfer(Boolean enableFullTransfer) {
        this.enableFullTransfer = enableFullTransfer;
        return this;
    }
    public Boolean getEnableFullTransfer() {
        return this.enableFullTransfer;
    }

    public CreateProjectShrinkRequest setEnableFullVerify(Boolean enableFullVerify) {
        this.enableFullVerify = enableFullVerify;
        return this;
    }
    public Boolean getEnableFullVerify() {
        return this.enableFullVerify;
    }

    public CreateProjectShrinkRequest setEnableIncrTransfer(Boolean enableIncrTransfer) {
        this.enableIncrTransfer = enableIncrTransfer;
        return this;
    }
    public Boolean getEnableIncrTransfer() {
        return this.enableIncrTransfer;
    }

    public CreateProjectShrinkRequest setEnableReverseIncrTransfer(Boolean enableReverseIncrTransfer) {
        this.enableReverseIncrTransfer = enableReverseIncrTransfer;
        return this;
    }
    public Boolean getEnableReverseIncrTransfer() {
        return this.enableReverseIncrTransfer;
    }

    public CreateProjectShrinkRequest setEnableStructTransfer(Boolean enableStructTransfer) {
        this.enableStructTransfer = enableStructTransfer;
        return this;
    }
    public Boolean getEnableStructTransfer() {
        return this.enableStructTransfer;
    }

    public CreateProjectShrinkRequest setFullTransferConfigShrink(String fullTransferConfigShrink) {
        this.fullTransferConfigShrink = fullTransferConfigShrink;
        return this;
    }
    public String getFullTransferConfigShrink() {
        return this.fullTransferConfigShrink;
    }

    public CreateProjectShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateProjectShrinkRequest setIncrTransferConfigShrink(String incrTransferConfigShrink) {
        this.incrTransferConfigShrink = incrTransferConfigShrink;
        return this;
    }
    public String getIncrTransferConfigShrink() {
        return this.incrTransferConfigShrink;
    }

    public CreateProjectShrinkRequest setLabelIdsShrink(String labelIdsShrink) {
        this.labelIdsShrink = labelIdsShrink;
        return this;
    }
    public String getLabelIdsShrink() {
        return this.labelIdsShrink;
    }

    public CreateProjectShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProjectShrinkRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public CreateProjectShrinkRequest setSinkEndpointId(String sinkEndpointId) {
        this.sinkEndpointId = sinkEndpointId;
        return this;
    }
    public String getSinkEndpointId() {
        return this.sinkEndpointId;
    }

    public CreateProjectShrinkRequest setSourceEndpointId(String sourceEndpointId) {
        this.sourceEndpointId = sourceEndpointId;
        return this;
    }
    public String getSourceEndpointId() {
        return this.sourceEndpointId;
    }

    public CreateProjectShrinkRequest setStructTransferConfigShrink(String structTransferConfigShrink) {
        this.structTransferConfigShrink = structTransferConfigShrink;
        return this;
    }
    public String getStructTransferConfigShrink() {
        return this.structTransferConfigShrink;
    }

    public CreateProjectShrinkRequest setTransferMappingShrink(String transferMappingShrink) {
        this.transferMappingShrink = transferMappingShrink;
        return this;
    }
    public String getTransferMappingShrink() {
        return this.transferMappingShrink;
    }

    public CreateProjectShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateProjectShrinkRequest setUseOss(Boolean useOss) {
        this.useOss = useOss;
        return this;
    }
    public Boolean getUseOss() {
        return this.useOss;
    }

    public CreateProjectShrinkRequest setWorkerGradeId(String workerGradeId) {
        this.workerGradeId = workerGradeId;
        return this;
    }
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

}
