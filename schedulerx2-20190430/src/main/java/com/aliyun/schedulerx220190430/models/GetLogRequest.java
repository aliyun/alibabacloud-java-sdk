// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetLogRequest extends TeaModel {
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("JobInstanceId")
    public String jobInstanceId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Line")
    public Integer line;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NamespaceSource")
    public String namespaceSource;

    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Reverse")
    public Boolean reverse;

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
