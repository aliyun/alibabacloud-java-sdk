// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class ListInfiniteCanvasesResponseBody extends TeaModel {
    /**
     * <p>The list of infinite canvases.</p>
     */
    @NameInMap("CanvasList")
    public java.util.List<ListInfiniteCanvasesResponseBodyCanvasList> canvasList;

    /**
     * <p>The current page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of infinite canvases.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListInfiniteCanvasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInfiniteCanvasesResponseBody self = new ListInfiniteCanvasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInfiniteCanvasesResponseBody setCanvasList(java.util.List<ListInfiniteCanvasesResponseBodyCanvasList> canvasList) {
        this.canvasList = canvasList;
        return this;
    }
    public java.util.List<ListInfiniteCanvasesResponseBodyCanvasList> getCanvasList() {
        return this.canvasList;
    }

    public ListInfiniteCanvasesResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListInfiniteCanvasesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInfiniteCanvasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInfiniteCanvasesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListInfiniteCanvasesResponseBodyCanvasList extends TeaModel {
        /**
         * <p>The infinite canvas ID.</p>
         * 
         * <strong>example:</strong>
         * <p>canvas_xxx</p>
         */
        @NameInMap("CanvasId")
        public String canvasId;

        /**
         * <p>The cover URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/cover.png">http://example.com/cover.png</a></p>
         */
        @NameInMap("CoverUrl")
        public String coverUrl;

        /**
         * <p>The creation time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-26T10:21:17Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-18T10:03:56Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The thumbnail height, in px.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/thumbnail2.png">http://example.com/thumbnail2.png</a></p>
         */
        @NameInMap("Thumbnail")
        public String thumbnail;

        /**
         * <p>The title of the infinite canvas.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Title")
        public String title;

        public static ListInfiniteCanvasesResponseBodyCanvasList build(java.util.Map<String, ?> map) throws Exception {
            ListInfiniteCanvasesResponseBodyCanvasList self = new ListInfiniteCanvasesResponseBodyCanvasList();
            return TeaModel.build(map, self);
        }

        public ListInfiniteCanvasesResponseBodyCanvasList setCanvasId(String canvasId) {
            this.canvasId = canvasId;
            return this;
        }
        public String getCanvasId() {
            return this.canvasId;
        }

        public ListInfiniteCanvasesResponseBodyCanvasList setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListInfiniteCanvasesResponseBodyCanvasList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListInfiniteCanvasesResponseBodyCanvasList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListInfiniteCanvasesResponseBodyCanvasList setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public ListInfiniteCanvasesResponseBodyCanvasList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
