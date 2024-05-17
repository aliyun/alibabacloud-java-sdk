// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetLogRequest extends TeaModel {
    /**
     * <p>The time when the job stops running. Specify a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <p>The application group ID. You can obtain the application group ID on the Application Management page in the SchedulerX console.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The job ID.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The job instance ID.</p>
     */
    @NameInMap("JobInstanceId")
    public String jobInstanceId;

    /**
     * <p>The keyword.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of rows to return. The maximum number is 200.</p>
     */
    @NameInMap("Line")
    public Integer line;

    /**
     * <p>The namespace ID. You can obtain the namespace ID on the Namespace page in the SchedulerX console.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The source of the namespace. This parameter is required only for a special third party.</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The number of offset rows. This parameter can be used for a paged query.</p>
     */
    @NameInMap("Offset")
    public Integer offset;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to reverse the order. By default, the order is reversed.</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <p>The time when the job starts to run. Specify a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    public static GetLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogRequest self = new GetLogRequest();
        return TeaModel.build(map, self);
    }

    public GetLogRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public GetLogRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetLogRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetLogRequest setJobInstanceId(String jobInstanceId) {
        this.jobInstanceId = jobInstanceId;
        return this;
    }
    public String getJobInstanceId() {
        return this.jobInstanceId;
    }

    public GetLogRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetLogRequest setLine(Integer line) {
        this.line = line;
        return this;
    }
    public Integer getLine() {
        return this.line;
    }

    public GetLogRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetLogRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public GetLogRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public GetLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLogRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public GetLogRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

}
