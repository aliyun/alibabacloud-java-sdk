// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListCloudAppPatchesRequest extends TeaModel {
    /**
     * <p>The ID of the cloud application. This ID corresponds to a unique application package.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cap-b06b26edfhytbn b94a75ae1a79efc90eb</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The time range for filtering. The time must be in UTC and in the ISO 8601 standard format yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number of the list to return. The value starts from 1.
     * Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. The maximum value is 100.
     * Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the patch package.</p>
     * 
     * <strong>example:</strong>
     * <p>patch-03fa76e8e13a49b6a966b063d9d309b4</p>
     */
    @NameInMap("PatchId")
    public String patchId;

    /**
     * <p>The name of the patch package.</p>
     * 
     * <strong>example:</strong>
     * <p>patch-1</p>
     */
    @NameInMap("PatchName")
    public String patchName;

    /**
     * <p>The start of the time range to query. The time is in UTC and follows the ISO 8601 standard. The format is yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-11-29T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListCloudAppPatchesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAppPatchesRequest self = new ListCloudAppPatchesRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudAppPatchesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListCloudAppPatchesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListCloudAppPatchesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCloudAppPatchesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCloudAppPatchesRequest setPatchId(String patchId) {
        this.patchId = patchId;
        return this;
    }
    public String getPatchId() {
        return this.patchId;
    }

    public ListCloudAppPatchesRequest setPatchName(String patchName) {
        this.patchName = patchName;
        return this;
    }
    public String getPatchName() {
        return this.patchName;
    }

    public ListCloudAppPatchesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
