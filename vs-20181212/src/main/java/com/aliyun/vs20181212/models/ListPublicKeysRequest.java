// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListPublicKeysRequest extends TeaModel {
    /**
     * <p>A parameter for filtering by time range. The time must be in UTC and follow the ISO 8601 standard. The format is yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-22T02:23:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the public key group.</p>
     * 
     * <strong>example:</strong>
     * <p>g-test</p>
     */
    @NameInMap("KeyGroup")
    public String keyGroup;

    /**
     * <p>The name of the public key.</p>
     * 
     * <strong>example:</strong>
     * <p>mykey</p>
     */
    @NameInMap("KeyName")
    public String keyName;

    /**
     * <p>The type of the public key. Valid values:</p>
     * <ul>
     * <li><p><strong>adb</strong>: ADB key</p>
     * </li>
     * <li><p><strong>ssh</strong>: SSH key</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ssh</p>
     */
    @NameInMap("KeyType")
    public String keyType;

    /**
     * <p>The page number of the list to query. The value starts from 1.
     * Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page for a paged query. Valid values: 1 to 100.
     * Default value: 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>A parameter for filtering by time range. The time must be in UTC and follow the ISO 8601 standard. The format is yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-21T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListPublicKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublicKeysRequest self = new ListPublicKeysRequest();
        return TeaModel.build(map, self);
    }

    public ListPublicKeysRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListPublicKeysRequest setKeyGroup(String keyGroup) {
        this.keyGroup = keyGroup;
        return this;
    }
    public String getKeyGroup() {
        return this.keyGroup;
    }

    public ListPublicKeysRequest setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

    public ListPublicKeysRequest setKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }
    public String getKeyType() {
        return this.keyType;
    }

    public ListPublicKeysRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListPublicKeysRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPublicKeysRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
