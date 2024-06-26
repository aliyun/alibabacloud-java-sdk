// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ExecuteJobRequest extends TeaModel {
    /**
     * <p>Specifies whether to check the job status. Valid values: -<strong>true</strong>: The job can be run only if the job is enabled. -<strong>false</strong>: The job can be run even if the job is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CheckJobStatus")
    public Boolean checkJobStatus;

    /**
     * <p>The type of the designated machine. Valid values: -<strong>1</strong>: worker. -<strong>2</strong>: label.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DesignateType")
    public Integer designateType;

    /**
     * <p>The application ID. You can obtain the application ID on the Application Management page in the SchedulerX console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testSchedulerx.defaultGroup</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The parameters that are passed to trigger the job to run. The input value can be a random string. The parameters that are passed are obtained by calling the <code>context.getInstanceParameters()</code> class in the <code>processor</code> code. The parameters are different from custom parameters for creating jobs.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("InstanceParameters")
    public String instanceParameters;

    /**
     * <p>The job ID. You can obtain the job ID on the Task Management page in the SchedulerX console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>92583</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The label of the worker.</p>
     * 
     * <strong>example:</strong>
     * <p>gray</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The namespace ID. You can obtain the namespace ID on the Namespace page in the SchedulerX console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The source of the namespace. This parameter is required only for a special third party.</p>
     * 
     * <strong>example:</strong>
     * <p>schedulerx</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The worker address of the application. To query the worker address, call the GetWokerList operation.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:xxxxxxx@127.0.0.1">xxxxxxx@127.0.0.1</a>:222</p>
     */
    @NameInMap("Worker")
    public String worker;

    public static ExecuteJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteJobRequest self = new ExecuteJobRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteJobRequest setCheckJobStatus(Boolean checkJobStatus) {
        this.checkJobStatus = checkJobStatus;
        return this;
    }
    public Boolean getCheckJobStatus() {
        return this.checkJobStatus;
    }

    public ExecuteJobRequest setDesignateType(Integer designateType) {
        this.designateType = designateType;
        return this;
    }
    public Integer getDesignateType() {
        return this.designateType;
    }

    public ExecuteJobRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ExecuteJobRequest setInstanceParameters(String instanceParameters) {
        this.instanceParameters = instanceParameters;
        return this;
    }
    public String getInstanceParameters() {
        return this.instanceParameters;
    }

    public ExecuteJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public ExecuteJobRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public ExecuteJobRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ExecuteJobRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public ExecuteJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExecuteJobRequest setWorker(String worker) {
        this.worker = worker;
        return this;
    }
    public String getWorker() {
        return this.worker;
    }

}
