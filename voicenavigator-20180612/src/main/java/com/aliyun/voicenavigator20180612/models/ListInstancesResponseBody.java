// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<ListInstancesResponseBodyInstances> instances;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>A8AED3C8-F57B-5D71-9A34-4A170287533F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setInstances(java.util.List<ListInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("ApplicableOperations")
        public java.util.List<String> applicableOperations;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Concurrency")
        public Long concurrency;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>dc437bba-5a25-4bbc-b4c2-f268864bebb5</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1582266750353</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ModifyUserName")
        public String modifyUserName;

        @NameInMap("Name")
        public String name;

        @NameInMap("NluServiceParamsJson")
        public String nluServiceParamsJson;

        @NameInMap("Numbers")
        public java.util.List<String> numbers;

        /**
         * <strong>example:</strong>
         * <p>Published</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("UnionInstanceId")
        public String unionInstanceId;

        @NameInMap("UnionSource")
        public String unionSource;

        public static ListInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstances self = new ListInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstances setApplicableOperations(java.util.List<String> applicableOperations) {
            this.applicableOperations = applicableOperations;
            return this;
        }
        public java.util.List<String> getApplicableOperations() {
            return this.applicableOperations;
        }

        public ListInstancesResponseBodyInstances setConcurrency(Long concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Long getConcurrency() {
            return this.concurrency;
        }

        public ListInstancesResponseBodyInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListInstancesResponseBodyInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyInstances setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListInstancesResponseBodyInstances setModifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        public ListInstancesResponseBodyInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInstancesResponseBodyInstances setNluServiceParamsJson(String nluServiceParamsJson) {
            this.nluServiceParamsJson = nluServiceParamsJson;
            return this;
        }
        public String getNluServiceParamsJson() {
            return this.nluServiceParamsJson;
        }

        public ListInstancesResponseBodyInstances setNumbers(java.util.List<String> numbers) {
            this.numbers = numbers;
            return this;
        }
        public java.util.List<String> getNumbers() {
            return this.numbers;
        }

        public ListInstancesResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstancesResponseBodyInstances setUnionInstanceId(String unionInstanceId) {
            this.unionInstanceId = unionInstanceId;
            return this;
        }
        public String getUnionInstanceId() {
            return this.unionInstanceId;
        }

        public ListInstancesResponseBodyInstances setUnionSource(String unionSource) {
            this.unionSource = unionSource;
            return this;
        }
        public String getUnionSource() {
            return this.unionSource;
        }

    }

}
