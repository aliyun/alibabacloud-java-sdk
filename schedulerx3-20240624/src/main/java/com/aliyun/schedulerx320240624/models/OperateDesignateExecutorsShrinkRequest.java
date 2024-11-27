// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateDesignateExecutorsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddressList")
    public String addressListShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DesignateType")
    public Integer designateType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>74</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Transferable")
    public Boolean transferable;

    public static OperateDesignateExecutorsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateDesignateExecutorsShrinkRequest self = new OperateDesignateExecutorsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public OperateDesignateExecutorsShrinkRequest setAddressListShrink(String addressListShrink) {
        this.addressListShrink = addressListShrink;
        return this;
    }
    public String getAddressListShrink() {
        return this.addressListShrink;
    }

    public OperateDesignateExecutorsShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public OperateDesignateExecutorsShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public OperateDesignateExecutorsShrinkRequest setDesignateType(Integer designateType) {
        this.designateType = designateType;
        return this;
    }
    public Integer getDesignateType() {
        return this.designateType;
    }

    public OperateDesignateExecutorsShrinkRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public OperateDesignateExecutorsShrinkRequest setTransferable(Boolean transferable) {
        this.transferable = transferable;
        return this;
    }
    public Boolean getTransferable() {
        return this.transferable;
    }

}
