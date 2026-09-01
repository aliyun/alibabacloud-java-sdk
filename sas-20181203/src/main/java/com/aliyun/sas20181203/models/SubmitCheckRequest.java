// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SubmitCheckRequest extends TeaModel {
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The scan range. Valid values:</p>
     * <ul>
     * <li><strong>FULL</strong>: scans all check items</li>
     * <li><strong>POLICY</strong>: scans custom-configured check items</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>POLICY</p>
     */
    @NameInMap("ScanRange")
    public String scanRange;

    /**
     * <p>The task source. Valid values:</p>
     * <ul>
     * <li><strong>YAO_CHI</strong>: Alibaba Cloud ApsaraDB console.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>YAO_CHI</p>
     */
    @NameInMap("TaskSource")
    public String taskSource;

    public static SubmitCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCheckRequest self = new SubmitCheckRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCheckRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public SubmitCheckRequest setScanRange(String scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public String getScanRange() {
        return this.scanRange;
    }

    public SubmitCheckRequest setTaskSource(String taskSource) {
        this.taskSource = taskSource;
        return this;
    }
    public String getTaskSource() {
        return this.taskSource;
    }

}
