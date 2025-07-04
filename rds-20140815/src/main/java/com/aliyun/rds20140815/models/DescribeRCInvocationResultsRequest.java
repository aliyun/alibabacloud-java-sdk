// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInvocationResultsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c-7d2a745b412b4601b2d47f6a768d****</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <strong>example:</strong>
     * <p>Base64</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeHistory")
    public Boolean includeHistory;

    /**
     * <strong>example:</strong>
     * <p>rc-i322y2t562oh7o******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>t-7d2a745b412b4601b2d47f6a768d****</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("InvokeRecordStatus")
    public String invokeRecordStatus;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmx****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<DescribeRCInvocationResultsRequestTag> tag;

    public static DescribeRCInvocationResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInvocationResultsRequest self = new DescribeRCInvocationResultsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRCInvocationResultsRequest setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public DescribeRCInvocationResultsRequest setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public DescribeRCInvocationResultsRequest setIncludeHistory(Boolean includeHistory) {
        this.includeHistory = includeHistory;
        return this;
    }
    public Boolean getIncludeHistory() {
        return this.includeHistory;
    }

    public DescribeRCInvocationResultsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRCInvocationResultsRequest setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public DescribeRCInvocationResultsRequest setInvokeRecordStatus(String invokeRecordStatus) {
        this.invokeRecordStatus = invokeRecordStatus;
        return this;
    }
    public String getInvokeRecordStatus() {
        return this.invokeRecordStatus;
    }

    public DescribeRCInvocationResultsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeRCInvocationResultsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeRCInvocationResultsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRCInvocationResultsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRCInvocationResultsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRCInvocationResultsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeRCInvocationResultsRequest setTag(java.util.List<DescribeRCInvocationResultsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeRCInvocationResultsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeRCInvocationResultsRequestTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeRCInvocationResultsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInvocationResultsRequestTag self = new DescribeRCInvocationResultsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeRCInvocationResultsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeRCInvocationResultsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
