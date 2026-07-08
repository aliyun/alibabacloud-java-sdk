// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListFilePushStatusesRequest extends TeaModel {
    /**
     * <p>A time range filter parameter. Specify the value in ISO8601 format using UTC time: yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-23T02:13:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The file ID, which uniquely identifies a file.</p>
     * 
     * <strong>example:</strong>
     * <p>f-1671accd4dafdag3er256cvgewt13f7141db2f7</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The file name.</p>
     * 
     * <strong>example:</strong>
     * <p>myfile</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The page number of the results to return. Pages start from 1.Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page in a paged query. Valid values: 1 to 100.Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The cloud application service instance ID. Use this parameter to query files installed on a specific instance.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    /**
     * <p>A time range filter parameter. Specify the value in ISO8601 format using UTC time: yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-17T12:16:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListFilePushStatusesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFilePushStatusesRequest self = new ListFilePushStatusesRequest();
        return TeaModel.build(map, self);
    }

    public ListFilePushStatusesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListFilePushStatusesRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ListFilePushStatusesRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ListFilePushStatusesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListFilePushStatusesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListFilePushStatusesRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public ListFilePushStatusesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
