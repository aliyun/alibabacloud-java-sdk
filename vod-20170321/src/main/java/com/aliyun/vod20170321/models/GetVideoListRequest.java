// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoListRequest extends TeaModel {
    /**
     * <p>The category ID. You can obtain the category ID by using one of the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Asset Configuration</strong> &gt; <strong>Category Management</strong> to view the category ID.</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/56401.html">Create a category</a> operation to create a category. The category ID is the value of the CateId response parameter.</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/56406.html">Get categories and subcategories</a> operation to query categories. The category ID is the value of the CateId response parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>781111</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The end time of the creation time, which must be later than the start time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-11T12:59:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The current page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: <strong>10</strong>. Maximum value: <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of custom IDs. You can specify one or more custom IDs separated by commas (,). You can specify up to 20 custom IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>123-123,1234-1234</p>
     */
    @NameInMap("ReferenceIds")
    public String referenceIds;

    /**
     * <p>The sorting method of the query results. Valid values:</p>
     * <ul>
     * <li><strong>CreationTime:Desc</strong> (default): Sort by creation time in descending order.</li>
     * <li><strong>CreationTime:Asc</strong>: Sort by creation time in ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreationTime:Asc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The start time of the creation time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-11T12:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The video status. You can specify multiple statuses separated by commas (,). Valid values:</p>
     * <ul>
     * <li><strong>Uploading</strong>: The video is being uploaded.</li>
     * <li><strong>UploadFail</strong>: The video failed to be uploaded.</li>
     * <li><strong>UploadSucc</strong>: The video is uploaded.</li>
     * <li><strong>Transcoding</strong>: The video is being transcoded.</li>
     * <li><strong>TranscodeFail</strong>: The video failed to be transcoded.</li>
     * <li><strong>Checking</strong>: The video is being reviewed.</li>
     * <li><strong>Blocked</strong>: The video is blocked.</li>
     * <li><strong>Normal</strong>: The video is normal.</li>
     * <li><strong>ProduceFail</strong>: The video failed to be produced.</li>
     * </ul>
     * <p>For more information about the definitions and limits of video statuses, refer to <a href="~~52839#section-p7c-jgy-070~~">Status: video status</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Uploading,Normal</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The storage address of the audio or video file.</p>
     * 
     * <strong>example:</strong>
     * <p>out-****.oss-cn-shanghai.aliyuncs.com</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    public static GetVideoListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoListRequest self = new GetVideoListRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoListRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public GetVideoListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetVideoListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetVideoListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetVideoListRequest setReferenceIds(String referenceIds) {
        this.referenceIds = referenceIds;
        return this;
    }
    public String getReferenceIds() {
        return this.referenceIds;
    }

    public GetVideoListRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public GetVideoListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetVideoListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetVideoListRequest setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public String getStorageLocation() {
        return this.storageLocation;
    }

}
