// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizePdfResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizePdfResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>CD9A9659-ABEE-4A7D-837F-9FDF40879A97</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizePdfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizePdfResponseBody self = new RecognizePdfResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizePdfResponseBody setData(RecognizePdfResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizePdfResponseBodyData getData() {
        return this.data;
    }

    public RecognizePdfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizePdfResponseBodyDataWordsInfoPositions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>863</p>
         */
        @NameInMap("X")
        public Long x;

        /**
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("Y")
        public Long y;

        public static RecognizePdfResponseBodyDataWordsInfoPositions build(java.util.Map<String, ?> map) throws Exception {
            RecognizePdfResponseBodyDataWordsInfoPositions self = new RecognizePdfResponseBodyDataWordsInfoPositions();
            return TeaModel.build(map, self);
        }

        public RecognizePdfResponseBodyDataWordsInfoPositions setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public RecognizePdfResponseBodyDataWordsInfoPositions setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class RecognizePdfResponseBodyDataWordsInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Angle")
        public Long angle;

        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Height")
        public Long height;

        @NameInMap("Positions")
        public java.util.List<RecognizePdfResponseBodyDataWordsInfoPositions> positions;

        /**
         * <strong>example:</strong>
         * <p>205</p>
         */
        @NameInMap("Width")
        public Long width;

        @NameInMap("Word")
        public String word;

        /**
         * <strong>example:</strong>
         * <p>863</p>
         */
        @NameInMap("X")
        public Long x;

        /**
         * <strong>example:</strong>
         * <p>46</p>
         */
        @NameInMap("Y")
        public Long y;

        public static RecognizePdfResponseBodyDataWordsInfo build(java.util.Map<String, ?> map) throws Exception {
            RecognizePdfResponseBodyDataWordsInfo self = new RecognizePdfResponseBodyDataWordsInfo();
            return TeaModel.build(map, self);
        }

        public RecognizePdfResponseBodyDataWordsInfo setAngle(Long angle) {
            this.angle = angle;
            return this;
        }
        public Long getAngle() {
            return this.angle;
        }

        public RecognizePdfResponseBodyDataWordsInfo setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public RecognizePdfResponseBodyDataWordsInfo setPositions(java.util.List<RecognizePdfResponseBodyDataWordsInfoPositions> positions) {
            this.positions = positions;
            return this;
        }
        public java.util.List<RecognizePdfResponseBodyDataWordsInfoPositions> getPositions() {
            return this.positions;
        }

        public RecognizePdfResponseBodyDataWordsInfo setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public RecognizePdfResponseBodyDataWordsInfo setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

        public RecognizePdfResponseBodyDataWordsInfo setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public RecognizePdfResponseBodyDataWordsInfo setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class RecognizePdfResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Angle")
        public Long angle;

        /**
         * <strong>example:</strong>
         * <p>788</p>
         */
        @NameInMap("Height")
        public Long height;

        /**
         * <strong>example:</strong>
         * <p>610</p>
         */
        @NameInMap("OrgHeight")
        public Long orgHeight;

        /**
         * <strong>example:</strong>
         * <p>394</p>
         */
        @NameInMap("OrgWidth")
        public Long orgWidth;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageIndex")
        public Long pageIndex;

        /**
         * <strong>example:</strong>
         * <p>1220</p>
         */
        @NameInMap("Width")
        public Long width;

        @NameInMap("WordsInfo")
        public java.util.List<RecognizePdfResponseBodyDataWordsInfo> wordsInfo;

        public static RecognizePdfResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizePdfResponseBodyData self = new RecognizePdfResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizePdfResponseBodyData setAngle(Long angle) {
            this.angle = angle;
            return this;
        }
        public Long getAngle() {
            return this.angle;
        }

        public RecognizePdfResponseBodyData setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public RecognizePdfResponseBodyData setOrgHeight(Long orgHeight) {
            this.orgHeight = orgHeight;
            return this;
        }
        public Long getOrgHeight() {
            return this.orgHeight;
        }

        public RecognizePdfResponseBodyData setOrgWidth(Long orgWidth) {
            this.orgWidth = orgWidth;
            return this;
        }
        public Long getOrgWidth() {
            return this.orgWidth;
        }

        public RecognizePdfResponseBodyData setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public RecognizePdfResponseBodyData setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public RecognizePdfResponseBodyData setWordsInfo(java.util.List<RecognizePdfResponseBodyDataWordsInfo> wordsInfo) {
            this.wordsInfo = wordsInfo;
            return this;
        }
        public java.util.List<RecognizePdfResponseBodyDataWordsInfo> getWordsInfo() {
            return this.wordsInfo;
        }

    }

}
