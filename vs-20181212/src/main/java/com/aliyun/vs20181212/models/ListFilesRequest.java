// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListFilesRequest extends TeaModel {
    /**
     * <p>This parameter filters data by time range. It must conform to the ISO 8601 standard and use UTC time in the format yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-31T06:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>File ID. Each ID corresponds to a unique active file.</p>
     * 
     * <strong>example:</strong>
     * <p>f-1671accd4dafdag3er256cvgewt13f7141db2f7</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>File name.</p>
     * 
     * <strong>example:</strong>
     * <p>myfile</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The page number to retrieve. Page numbering starts at 1.Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of rows per page for a paged query. The value must be in the range of 1 to 100. The default is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Start time of the time range filter. Specify in ISO 8601 format using UTC time. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-30T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFilesRequest self = new ListFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListFilesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListFilesRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ListFilesRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ListFilesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListFilesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListFilesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
