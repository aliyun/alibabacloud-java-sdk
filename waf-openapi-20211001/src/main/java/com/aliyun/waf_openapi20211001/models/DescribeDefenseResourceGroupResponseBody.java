// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The information about the protected object group.</p>
     */
    @NameInMap("Group")
    public DescribeDefenseResourceGroupResponseBodyGroup group;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E67D21C6-5376-5F94-B745-70E08D03E3CB</p>
     */
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
        /**
         * <p>The description of the protected object group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the protected object group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>23242312312</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The most recent time when the protected object group was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>23242312312</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The name of the protected object group.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The protected objects in the protected object group. The protected objects are separated with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>test1.aliyundoc.com,test2.aliyundoc.com</p>
         */
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
