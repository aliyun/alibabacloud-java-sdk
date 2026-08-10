// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetInfiniteCanvasResponseBody extends TeaModel {
    /**
     * <p>The infinite canvas details.</p>
     */
    @NameInMap("InfiniteCanvas")
    public GetInfiniteCanvasResponseBodyInfiniteCanvas infiniteCanvas;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInfiniteCanvasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInfiniteCanvasResponseBody self = new GetInfiniteCanvasResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInfiniteCanvasResponseBody setInfiniteCanvas(GetInfiniteCanvasResponseBodyInfiniteCanvas infiniteCanvas) {
        this.infiniteCanvas = infiniteCanvas;
        return this;
    }
    public GetInfiniteCanvasResponseBodyInfiniteCanvas getInfiniteCanvas() {
        return this.infiniteCanvas;
    }

    public GetInfiniteCanvasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInfiniteCanvasResponseBodyInfiniteCanvas extends TeaModel {
        /**
         * <p>The ID of the infinite canvas.</p>
         * 
         * <strong>example:</strong>
         * <p>canvas_gesad*</p>
         */
        @NameInMap("CanvasId")
        public String canvasId;

        /**
         * <p>The cover URL.</p>
         * 
         * <strong>example:</strong>
         * <p>https://*uncs.com/cover.png</p>
         */
        @NameInMap("CoverUrl")
        public String coverUrl;

        /**
         * <p>The creation time in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-01T08:42:16Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-01T08:42:16Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The thumbnail URL.</p>
         * 
         * <strong>example:</strong>
         * <p>https://*uncs.com/cover.png</p>
         */
        @NameInMap("Thumbnail")
        public String thumbnail;

        /**
         * <p>The title of the infinite canvas.</p>
         * 
         * <strong>example:</strong>
         * <p>test infinite canvas</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetInfiniteCanvasResponseBodyInfiniteCanvas build(java.util.Map<String, ?> map) throws Exception {
            GetInfiniteCanvasResponseBodyInfiniteCanvas self = new GetInfiniteCanvasResponseBodyInfiniteCanvas();
            return TeaModel.build(map, self);
        }

        public GetInfiniteCanvasResponseBodyInfiniteCanvas setCanvasId(String canvasId) {
            this.canvasId = canvasId;
            return this;
        }
        public String getCanvasId() {
            return this.canvasId;
        }

        public GetInfiniteCanvasResponseBodyInfiniteCanvas setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public GetInfiniteCanvasResponseBodyInfiniteCanvas setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetInfiniteCanvasResponseBodyInfiniteCanvas setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetInfiniteCanvasResponseBodyInfiniteCanvas setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public GetInfiniteCanvasResponseBodyInfiniteCanvas setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
