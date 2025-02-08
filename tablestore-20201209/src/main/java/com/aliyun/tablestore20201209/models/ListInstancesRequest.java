// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <p>The name of the instance. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The names of the instances. This parameter is used to specify multiple instances that you want to query at the same time.</p>
     */
    @NameInMap("InstanceNameList")
    public java.util.List<String> instanceNameList;

    /**
     * <p>The maximum number of instances that you want to return. Valid values: 0 to 200. If you do not configure this parameter or set this parameter to 0, the default value of 100 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start position of the query. Set this parameter to the value of the NextToken parameter that is returned from the last call. Instances are returned in lexicographical order starting from the position that is specified by this parameter. The first time you call the operation, leave this parameter empty.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESCG15aC1xxxxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The resource group ID. You can query the ID on the Resource Group page in the Resource Management console.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek24upgom6p5ri</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The instance status.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tag")
    public java.util.List<ListInstancesRequestTag> tag;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListInstancesRequest setInstanceNameList(java.util.List<String> instanceNameList) {
        this.instanceNameList = instanceNameList;
        return this;
    }
    public java.util.List<String> getInstanceNameList() {
        return this.instanceNameList;
    }

    public ListInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListInstancesRequest setTag(java.util.List<ListInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListInstancesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListInstancesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesRequestTag self = new ListInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
