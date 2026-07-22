// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateDesignateExecutorsRequest extends TeaModel {
    /**
     * <p>The address list.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddressList")
    public java.util.List<String> addressList;

    @NameInMap("AppGroupId")
    public Long appGroupId;

    /**
     * <p>The application name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The type of the designated machine. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: designated worker.</li>
     * <li><strong>2</strong>: designated label.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DesignateType")
    public Integer designateType;

    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>74</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>Specifies whether to enable failover.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Transferable")
    public Boolean transferable;

    public static OperateDesignateExecutorsRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateDesignateExecutorsRequest self = new OperateDesignateExecutorsRequest();
        return TeaModel.build(map, self);
    }

    public OperateDesignateExecutorsRequest setAddressList(java.util.List<String> addressList) {
        this.addressList = addressList;
        return this;
    }
    public java.util.List<String> getAddressList() {
        return this.addressList;
    }

    public OperateDesignateExecutorsRequest setAppGroupId(Long appGroupId) {
        this.appGroupId = appGroupId;
        return this;
    }
    public Long getAppGroupId() {
        return this.appGroupId;
    }

    public OperateDesignateExecutorsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public OperateDesignateExecutorsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public OperateDesignateExecutorsRequest setDesignateType(Integer designateType) {
        this.designateType = designateType;
        return this;
    }
    public Integer getDesignateType() {
        return this.designateType;
    }

    public OperateDesignateExecutorsRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public OperateDesignateExecutorsRequest setTransferable(Boolean transferable) {
        this.transferable = transferable;
        return this;
    }
    public Boolean getTransferable() {
        return this.transferable;
    }

}
