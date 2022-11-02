// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceGroupResponseBody extends TeaModel {
    @NameInMap("Group")
    public DescribeDefenseResourceGroupResponseBodyGroup group;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDefenseResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseResourceGroupResponseBody self = new DescribeDefenseResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseResourceGroupResponseBody setGroup(DescribeDefenseResourceGroupResponseBodyGroup group) {
        this.group = group;
        return this;
    }
    public DescribeDefenseResourceGroupResponseBodyGroup getGroup() {
        return this.group;
    }

    public DescribeDefenseResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDefenseResourceGroupResponseBodyGroup extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("ResourceList")
        public String resourceList;

        public static DescribeDefenseResourceGroupResponseBodyGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseResourceGroupResponseBodyGroup self = new DescribeDefenseResourceGroupResponseBodyGroup();
            return TeaModel.build(map, self);
        }

        public DescribeDefenseResourceGroupResponseBodyGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDefenseResourceGroupResponseBodyGroup setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDefenseResourceGroupResponseBodyGroup setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDefenseResourceGroupResponseBodyGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDefenseResourceGroupResponseBodyGroup setResourceList(String resourceList) {
            this.resourceList = resourceList;
            return this;
        }
        public String getResourceList() {
            return this.resourceList;
        }

    }

}
