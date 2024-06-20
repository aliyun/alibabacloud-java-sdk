// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseTemplateValidGroupsResponseBody extends TeaModel {
    /**
     * <p>The names of the protected object groups.</p>
     */
    @NameInMap("Groups")
    public java.util.List<String> groups;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6EA4B39A-9C0C-5E57-993E-30B6****3AD0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>27</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDefenseTemplateValidGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseTemplateValidGroupsResponseBody self = new DescribeDefenseTemplateValidGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseTemplateValidGroupsResponseBody setGroups(java.util.List<String> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<String> getGroups() {
        return this.groups;
    }

    public DescribeDefenseTemplateValidGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefenseTemplateValidGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
