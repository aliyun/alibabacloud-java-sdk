// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockProcessStatusRequest extends TeaModel {
    /**
     * <p>Specifies whether to change the status of the process on multiple servers on which the process runs at the same time. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no</li>
     * <li><strong>1</strong>: yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DealAll")
    public Integer dealAll;

    /**
     * <p>The parameters required to change the status of multiple processes at a time. The value is in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;processPath&quot;:&quot;/etc/test1&quot;,&quot;uuid&quot;:&quot;0c1714dc-f7a3-4265-8364-7aa3fce8****&quot;},{&quot;processPath&quot;:&quot;/etc/test2&quot;,&quot;uuid&quot;:&quot;1cc45e7d-7698-4b2c-89d8-e8cba407****&quot;}]</p>
     */
    @NameInMap("OperateInfo")
    public String operateInfo;

    /**
     * <p>The paths to the processes.</p>
     */
    @NameInMap("ProcessPath")
    public java.util.List<String> processPath;

    /**
     * <p>The status of the process. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: cancels adding the process to the process whitelist</li>
     * <li><strong>1</strong>: adds the process to the process whitelist</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The UUID of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>bc8510e7-7327-4030-b75c-956e434d****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ModifyWebLockProcessStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockProcessStatusRequest self = new ModifyWebLockProcessStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockProcessStatusRequest setDealAll(Integer dealAll) {
        this.dealAll = dealAll;
        return this;
    }
    public Integer getDealAll() {
        return this.dealAll;
    }

    public ModifyWebLockProcessStatusRequest setOperateInfo(String operateInfo) {
        this.operateInfo = operateInfo;
        return this;
    }
    public String getOperateInfo() {
        return this.operateInfo;
    }

    public ModifyWebLockProcessStatusRequest setProcessPath(java.util.List<String> processPath) {
        this.processPath = processPath;
        return this;
    }
    public java.util.List<String> getProcessPath() {
        return this.processPath;
    }

    public ModifyWebLockProcessStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ModifyWebLockProcessStatusRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
