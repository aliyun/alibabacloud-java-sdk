// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SubmitCheckRequest extends TeaModel {
    /**
     * <p>The policy ID. This parameter takes effect only when ScanRange is set to POLICY. You can obtain the value by calling the ListCheckConfigs operation. If this parameter is not specified or is set to default, the scan is triggered based on the system default policy. If the default policy does not exist, NoDefaultStrategy is returned. If another value is specified, the scan is triggered based on the check items of the specified policy. If the policy does not exist or does not belong to the current account, IllegalParam is returned. This parameter is ignored when ScanRange is set to FULL or FREE.</p>
     * 
     * <strong>example:</strong>
     * <p>22222f91-57af-4907-87f1-f9046da****</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the member accounts of the resource folder belong.</p>
     * <blockquote>
     * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The check scope. Valid values:</p>
     * <ul>
     * <li><strong>FULL</strong>: Scans all check items.</li>
     * <li><strong>POLICY</strong>: Scans check items of custom configurations.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>POLICY</p>
     */
    @NameInMap("ScanRange")
    public String scanRange;

    /**
     * <p>The source of the task. Valid values:</p>
     * <ul>
     * <li><strong>YAO_CHI</strong>: ApsaraDB console.</li>
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

    public SubmitCheckRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
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
