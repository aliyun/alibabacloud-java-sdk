// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DescribeWorkgroupsRequest extends TeaModel {
    /**
     * <p>The name of the workgroup.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 50. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The state of the workgroup. Valid values:</p>
     * <ul>
     * <li>NotStarted</li>
     * <li>InProgress</li>
     * <li>Cutover</li>
     * <li>Completed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InProgress</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tag")
    public java.util.List<DescribeWorkgroupsRequestTag> tag;

    /**
     * <p>The workgroup IDs. You can specify up to 50 workgroup IDs.</p>
     */
    @NameInMap("WorkgroupId")
    public java.util.List<String> workgroupId;

    public static DescribeWorkgroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkgroupsRequest self = new DescribeWorkgroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWorkgroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeWorkgroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeWorkgroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeWorkgroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWorkgroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeWorkgroupsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeWorkgroupsRequest setTag(java.util.List<DescribeWorkgroupsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeWorkgroupsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeWorkgroupsRequest setWorkgroupId(java.util.List<String> workgroupId) {
        this.workgroupId = workgroupId;
        return this;
    }
    public java.util.List<String> getWorkgroupId() {
        return this.workgroupId;
    }

    public static class DescribeWorkgroupsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeWorkgroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkgroupsRequestTag self = new DescribeWorkgroupsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeWorkgroupsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeWorkgroupsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
