// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceGroupNamesResponseBody extends TeaModel {
    /**
     * <p>The names of the protected object groups.</p>
     */
    @NameInMap("GroupNames")
    public java.util.List<String> groupNames;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDefenseResourceGroupNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseResourceGroupNamesResponseBody self = new DescribeDefenseResourceGroupNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseResourceGroupNamesResponseBody setGroupNames(java.util.List<String> groupNames) {
        this.groupNames = groupNames;
        return this;
    }
    public java.util.List<String> getGroupNames() {
        return this.groupNames;
    }

    public DescribeDefenseResourceGroupNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefenseResourceGroupNamesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
