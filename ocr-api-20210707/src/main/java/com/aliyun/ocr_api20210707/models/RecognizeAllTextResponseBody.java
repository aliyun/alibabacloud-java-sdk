// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeAllTextResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RecognizeAllTextResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>illegalImageUrl</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E2A98925-DC2C-18FB-995F-BAF507XXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeAllTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeAllTextResponseBody self = new RecognizeAllTextResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeAllTextResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeAllTextResponseBody setData(RecognizeAllTextResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeAllTextResponseBodyData getData() {
        return this.data;
    }

    public RecognizeAllTextResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeAllTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodePoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodePoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodePoints self = new RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodePoints();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodePoints setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodePoints setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodeRect extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CenterX")
        public Integer centerX;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("CenterY")
        public Integer centerY;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodeRect build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodeRect self = new RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodeRect();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodeRect setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodeRect setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodeRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodeRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BarCodeAngle")
        public Integer barCodeAngle;

        @NameInMap("BarCodePoints")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodePoints> barCodePoints;

        @NameInMap("BarCodeRect")
        public RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodeRect barCodeRect;

        /**
         * <strong>example:</strong>
         * <p>&quot;1100011XXXXXX&quot;</p>
         */
        @NameInMap("Data")
        public Object data;

        /**
         * <strong>example:</strong>
         * <p>Code128</p>
         */
        @NameInMap("Type")
        public String type;

        public static RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetails build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetails self = new RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetails();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetails setBarCodeAngle(Integer barCodeAngle) {
            this.barCodeAngle = barCodeAngle;
            return this;
        }
        public Integer getBarCodeAngle() {
            return this.barCodeAngle;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetails setBarCodePoints(java.util.List<RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodePoints> barCodePoints) {
            this.barCodePoints = barCodePoints;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodePoints> getBarCodePoints() {
            return this.barCodePoints;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetails setBarCodeRect(RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodeRect barCodeRect) {
            this.barCodeRect = barCodeRect;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodeRect getBarCodeRect() {
            return this.barCodeRect;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetails setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesBarCodeInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BarCodeCount")
        public Integer barCodeCount;

        @NameInMap("BarCodeDetails")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetails> barCodeDetails;

        public static RecognizeAllTextResponseBodyDataSubImagesBarCodeInfo build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesBarCodeInfo self = new RecognizeAllTextResponseBodyDataSubImagesBarCodeInfo();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesBarCodeInfo setBarCodeCount(Integer barCodeCount) {
            this.barCodeCount = barCodeCount;
            return this;
        }
        public Integer getBarCodeCount() {
            return this.barCodeCount;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBarCodeInfo setBarCodeDetails(java.util.List<RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetails> barCodeDetails) {
            this.barCodeDetails = barCodeDetails;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetails> getBarCodeDetails() {
            return this.barCodeDetails;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsBlockPoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsBlockPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsBlockPoints self = new RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsBlockPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsBlockPoints setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsBlockPoints setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsBlockRect extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CenterX")
        public Integer centerX;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("CenterY")
        public Integer centerY;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsBlockRect build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsBlockRect self = new RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsBlockRect();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsBlockRect setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsBlockRect setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsBlockRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsBlockRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfosCharPoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfosCharPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfosCharPoints self = new RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfosCharPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfosCharPoints setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfosCharPoints setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfosCharRect extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CenterX")
        public Integer centerX;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("CenterY")
        public Integer centerY;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfosCharRect build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfosCharRect self = new RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfosCharRect();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfosCharRect setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfosCharRect setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfosCharRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfosCharRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>95</p>
         */
        @NameInMap("CharConfidence")
        public Integer charConfidence;

        @NameInMap("CharContent")
        public String charContent;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CharId")
        public Integer charId;

        @NameInMap("CharPoints")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfosCharPoints> charPoints;

        @NameInMap("CharRect")
        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfosCharRect charRect;

        public static RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfos build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfos self = new RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfos();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfos setCharConfidence(Integer charConfidence) {
            this.charConfidence = charConfidence;
            return this;
        }
        public Integer getCharConfidence() {
            return this.charConfidence;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfos setCharContent(String charContent) {
            this.charContent = charContent;
            return this;
        }
        public String getCharContent() {
            return this.charContent;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfos setCharId(Integer charId) {
            this.charId = charId;
            return this;
        }
        public Integer getCharId() {
            return this.charId;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfos setCharPoints(java.util.List<RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfosCharPoints> charPoints) {
            this.charPoints = charPoints;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfosCharPoints> getCharPoints() {
            return this.charPoints;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfos setCharRect(RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfosCharRect charRect) {
            this.charRect = charRect;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfosCharRect getCharRect() {
            return this.charRect;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BlockAngle")
        public Integer blockAngle;

        /**
         * <strong>example:</strong>
         * <p>98</p>
         */
        @NameInMap("BlockConfidence")
        public Integer blockConfidence;

        @NameInMap("BlockContent")
        public String blockContent;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BlockId")
        public Integer blockId;

        @NameInMap("BlockPoints")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsBlockPoints> blockPoints;

        @NameInMap("BlockRect")
        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsBlockRect blockRect;

        @NameInMap("CharInfos")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfos> charInfos;

        public static RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetails build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetails self = new RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetails();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetails setBlockAngle(Integer blockAngle) {
            this.blockAngle = blockAngle;
            return this;
        }
        public Integer getBlockAngle() {
            return this.blockAngle;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetails setBlockConfidence(Integer blockConfidence) {
            this.blockConfidence = blockConfidence;
            return this;
        }
        public Integer getBlockConfidence() {
            return this.blockConfidence;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetails setBlockContent(String blockContent) {
            this.blockContent = blockContent;
            return this;
        }
        public String getBlockContent() {
            return this.blockContent;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetails setBlockId(Integer blockId) {
            this.blockId = blockId;
            return this;
        }
        public Integer getBlockId() {
            return this.blockId;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetails setBlockPoints(java.util.List<RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsBlockPoints> blockPoints) {
            this.blockPoints = blockPoints;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsBlockPoints> getBlockPoints() {
            return this.blockPoints;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetails setBlockRect(RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsBlockRect blockRect) {
            this.blockRect = blockRect;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsBlockRect getBlockRect() {
            return this.blockRect;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetails setCharInfos(java.util.List<RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfos> charInfos) {
            this.charInfos = charInfos;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetailsCharInfos> getCharInfos() {
            return this.charInfos;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesBlockInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("BlockCount")
        public Integer blockCount;

        @NameInMap("BlockDetails")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetails> blockDetails;

        public static RecognizeAllTextResponseBodyDataSubImagesBlockInfo build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesBlockInfo self = new RecognizeAllTextResponseBodyDataSubImagesBlockInfo();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfo setBlockCount(Integer blockCount) {
            this.blockCount = blockCount;
            return this;
        }
        public Integer getBlockCount() {
            return this.blockCount;
        }

        public RecognizeAllTextResponseBodyDataSubImagesBlockInfo setBlockDetails(java.util.List<RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetails> blockDetails) {
            this.blockDetails = blockDetails;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesBlockInfoBlockDetails> getBlockDetails() {
            return this.blockDetails;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesKvInfo extends TeaModel {
        @NameInMap("Data")
        public Object data;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("KvCount")
        public Integer kvCount;

        @NameInMap("KvDetails")
        public java.util.Map<String, DataSubImagesKvInfoKvDetailsValue> kvDetails;

        public static RecognizeAllTextResponseBodyDataSubImagesKvInfo build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesKvInfo self = new RecognizeAllTextResponseBodyDataSubImagesKvInfo();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesKvInfo setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public RecognizeAllTextResponseBodyDataSubImagesKvInfo setKvCount(Integer kvCount) {
            this.kvCount = kvCount;
            return this;
        }
        public Integer getKvCount() {
            return this.kvCount;
        }

        public RecognizeAllTextResponseBodyDataSubImagesKvInfo setKvDetails(java.util.Map<String, DataSubImagesKvInfoKvDetailsValue> kvDetails) {
            this.kvDetails = kvDetails;
            return this;
        }
        public java.util.Map<String, DataSubImagesKvInfoKvDetailsValue> getKvDetails() {
            return this.kvDetails;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesParagraphInfoParagraphDetails extends TeaModel {
        @NameInMap("BlockList")
        public java.util.List<Integer> blockList;

        @NameInMap("ParagraphContent")
        public String paragraphContent;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParagraphId")
        public Integer paragraphId;

        public static RecognizeAllTextResponseBodyDataSubImagesParagraphInfoParagraphDetails build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesParagraphInfoParagraphDetails self = new RecognizeAllTextResponseBodyDataSubImagesParagraphInfoParagraphDetails();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesParagraphInfoParagraphDetails setBlockList(java.util.List<Integer> blockList) {
            this.blockList = blockList;
            return this;
        }
        public java.util.List<Integer> getBlockList() {
            return this.blockList;
        }

        public RecognizeAllTextResponseBodyDataSubImagesParagraphInfoParagraphDetails setParagraphContent(String paragraphContent) {
            this.paragraphContent = paragraphContent;
            return this;
        }
        public String getParagraphContent() {
            return this.paragraphContent;
        }

        public RecognizeAllTextResponseBodyDataSubImagesParagraphInfoParagraphDetails setParagraphId(Integer paragraphId) {
            this.paragraphId = paragraphId;
            return this;
        }
        public Integer getParagraphId() {
            return this.paragraphId;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesParagraphInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("ParagraphCount")
        public Integer paragraphCount;

        @NameInMap("ParagraphDetails")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesParagraphInfoParagraphDetails> paragraphDetails;

        public static RecognizeAllTextResponseBodyDataSubImagesParagraphInfo build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesParagraphInfo self = new RecognizeAllTextResponseBodyDataSubImagesParagraphInfo();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesParagraphInfo setParagraphCount(Integer paragraphCount) {
            this.paragraphCount = paragraphCount;
            return this;
        }
        public Integer getParagraphCount() {
            return this.paragraphCount;
        }

        public RecognizeAllTextResponseBodyDataSubImagesParagraphInfo setParagraphDetails(java.util.List<RecognizeAllTextResponseBodyDataSubImagesParagraphInfoParagraphDetails> paragraphDetails) {
            this.paragraphDetails = paragraphDetails;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesParagraphInfoParagraphDetails> getParagraphDetails() {
            return this.paragraphDetails;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodePoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodePoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodePoints self = new RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodePoints();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodePoints setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodePoints setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodeRect extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CenterX")
        public Integer centerX;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("CenterY")
        public Integer centerY;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodeRect build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodeRect self = new RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodeRect();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodeRect setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodeRect setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodeRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodeRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>“<a href="http://www.gsxt.gov.cn/indeXXX%E2%80%9D">http://www.gsxt.gov.cn/indeXXX”</a></p>
         */
        @NameInMap("Data")
        public Object data;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("QrCodeAngle")
        public Integer qrCodeAngle;

        @NameInMap("QrCodePoints")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodePoints> qrCodePoints;

        @NameInMap("QrCodeRect")
        public RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodeRect qrCodeRect;

        public static RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetails build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetails self = new RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetails();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetails setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetails setQrCodeAngle(Integer qrCodeAngle) {
            this.qrCodeAngle = qrCodeAngle;
            return this;
        }
        public Integer getQrCodeAngle() {
            return this.qrCodeAngle;
        }

        public RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetails setQrCodePoints(java.util.List<RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodePoints> qrCodePoints) {
            this.qrCodePoints = qrCodePoints;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodePoints> getQrCodePoints() {
            return this.qrCodePoints;
        }

        public RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetails setQrCodeRect(RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodeRect qrCodeRect) {
            this.qrCodeRect = qrCodeRect;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodeRect getQrCodeRect() {
            return this.qrCodeRect;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesQrCodeInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("QrCodeCount")
        public Integer qrCodeCount;

        @NameInMap("QrCodeDetails")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetails> qrCodeDetails;

        public static RecognizeAllTextResponseBodyDataSubImagesQrCodeInfo build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesQrCodeInfo self = new RecognizeAllTextResponseBodyDataSubImagesQrCodeInfo();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesQrCodeInfo setQrCodeCount(Integer qrCodeCount) {
            this.qrCodeCount = qrCodeCount;
            return this;
        }
        public Integer getQrCodeCount() {
            return this.qrCodeCount;
        }

        public RecognizeAllTextResponseBodyDataSubImagesQrCodeInfo setQrCodeDetails(java.util.List<RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetails> qrCodeDetails) {
            this.qrCodeDetails = qrCodeDetails;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetails> getQrCodeDetails() {
            return this.qrCodeDetails;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesQualityInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>90.5</p>
         */
        @NameInMap("CompletenessScore")
        public Float completenessScore;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCopy")
        public Boolean isCopy;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsReshoot")
        public Boolean isReshoot;

        /**
         * <strong>example:</strong>
         * <p>80.5</p>
         */
        @NameInMap("QualityScore")
        public Float qualityScore;

        /**
         * <strong>example:</strong>
         * <p>10.5</p>
         */
        @NameInMap("TamperScore")
        public Float tamperScore;

        public static RecognizeAllTextResponseBodyDataSubImagesQualityInfo build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesQualityInfo self = new RecognizeAllTextResponseBodyDataSubImagesQualityInfo();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesQualityInfo setCompletenessScore(Float completenessScore) {
            this.completenessScore = completenessScore;
            return this;
        }
        public Float getCompletenessScore() {
            return this.completenessScore;
        }

        public RecognizeAllTextResponseBodyDataSubImagesQualityInfo setIsCopy(Boolean isCopy) {
            this.isCopy = isCopy;
            return this;
        }
        public Boolean getIsCopy() {
            return this.isCopy;
        }

        public RecognizeAllTextResponseBodyDataSubImagesQualityInfo setIsReshoot(Boolean isReshoot) {
            this.isReshoot = isReshoot;
            return this;
        }
        public Boolean getIsReshoot() {
            return this.isReshoot;
        }

        public RecognizeAllTextResponseBodyDataSubImagesQualityInfo setQualityScore(Float qualityScore) {
            this.qualityScore = qualityScore;
            return this;
        }
        public Float getQualityScore() {
            return this.qualityScore;
        }

        public RecognizeAllTextResponseBodyDataSubImagesQualityInfo setTamperScore(Float tamperScore) {
            this.tamperScore = tamperScore;
            return this;
        }
        public Float getTamperScore() {
            return this.tamperScore;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesRowInfoRowDetails extends TeaModel {
        @NameInMap("BlockList")
        public java.util.List<Integer> blockList;

        @NameInMap("RowContent")
        public String rowContent;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RowId")
        public Integer rowId;

        public static RecognizeAllTextResponseBodyDataSubImagesRowInfoRowDetails build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesRowInfoRowDetails self = new RecognizeAllTextResponseBodyDataSubImagesRowInfoRowDetails();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesRowInfoRowDetails setBlockList(java.util.List<Integer> blockList) {
            this.blockList = blockList;
            return this;
        }
        public java.util.List<Integer> getBlockList() {
            return this.blockList;
        }

        public RecognizeAllTextResponseBodyDataSubImagesRowInfoRowDetails setRowContent(String rowContent) {
            this.rowContent = rowContent;
            return this;
        }
        public String getRowContent() {
            return this.rowContent;
        }

        public RecognizeAllTextResponseBodyDataSubImagesRowInfoRowDetails setRowId(Integer rowId) {
            this.rowId = rowId;
            return this;
        }
        public Integer getRowId() {
            return this.rowId;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesRowInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("RowCount")
        public Integer rowCount;

        @NameInMap("RowDetails")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesRowInfoRowDetails> rowDetails;

        public static RecognizeAllTextResponseBodyDataSubImagesRowInfo build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesRowInfo self = new RecognizeAllTextResponseBodyDataSubImagesRowInfo();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesRowInfo setRowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Integer getRowCount() {
            return this.rowCount;
        }

        public RecognizeAllTextResponseBodyDataSubImagesRowInfo setRowDetails(java.util.List<RecognizeAllTextResponseBodyDataSubImagesRowInfoRowDetails> rowDetails) {
            this.rowDetails = rowDetails;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesRowInfoRowDetails> getRowDetails() {
            return this.rowDetails;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;3205823XXXXXX&quot;</p>
         */
        @NameInMap("AntiFakeCode")
        public String antiFakeCode;

        /**
         * <strong>example:</strong>
         * <p>&quot;XXX&quot;</p>
         */
        @NameInMap("CompanyId")
        public String companyId;

        @NameInMap("OrganizationName")
        public String organizationName;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("OrganizationNameEng")
        public String organizationNameEng;

        /**
         * <strong>example:</strong>
         * <p>&quot;3205823XXXXXX&quot;</p>
         */
        @NameInMap("OtherText")
        public String otherText;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("TaxpayerId")
        public String taxpayerId;

        @NameInMap("TopText")
        public String topText;

        public static RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsData self = new RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsData();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsData setAntiFakeCode(String antiFakeCode) {
            this.antiFakeCode = antiFakeCode;
            return this;
        }
        public String getAntiFakeCode() {
            return this.antiFakeCode;
        }

        public RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsData setCompanyId(String companyId) {
            this.companyId = companyId;
            return this;
        }
        public String getCompanyId() {
            return this.companyId;
        }

        public RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsData setOrganizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }
        public String getOrganizationName() {
            return this.organizationName;
        }

        public RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsData setOrganizationNameEng(String organizationNameEng) {
            this.organizationNameEng = organizationNameEng;
            return this;
        }
        public String getOrganizationNameEng() {
            return this.organizationNameEng;
        }

        public RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsData setOtherText(String otherText) {
            this.otherText = otherText;
            return this;
        }
        public String getOtherText() {
            return this.otherText;
        }

        public RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsData setTaxpayerId(String taxpayerId) {
            this.taxpayerId = taxpayerId;
            return this;
        }
        public String getTaxpayerId() {
            return this.taxpayerId;
        }

        public RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsData setTopText(String topText) {
            this.topText = topText;
            return this;
        }
        public String getTopText() {
            return this.topText;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsStampPoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsStampPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsStampPoints self = new RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsStampPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsStampPoints setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsStampPoints setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsStampRect extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CenterX")
        public Integer centerX;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("CenterY")
        public Integer centerY;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsStampRect build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsStampRect self = new RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsStampRect();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsStampRect setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsStampRect setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsStampRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsStampRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetails extends TeaModel {
        @NameInMap("Data")
        public RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsData data;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StampAngle")
        public Integer stampAngle;

        @NameInMap("StampPoints")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsStampPoints> stampPoints;

        @NameInMap("StampRect")
        public RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsStampRect stampRect;

        public static RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetails build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetails self = new RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetails();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetails setData(RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsData data) {
            this.data = data;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsData getData() {
            return this.data;
        }

        public RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetails setStampAngle(Integer stampAngle) {
            this.stampAngle = stampAngle;
            return this;
        }
        public Integer getStampAngle() {
            return this.stampAngle;
        }

        public RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetails setStampPoints(java.util.List<RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsStampPoints> stampPoints) {
            this.stampPoints = stampPoints;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsStampPoints> getStampPoints() {
            return this.stampPoints;
        }

        public RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetails setStampRect(RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsStampRect stampRect) {
            this.stampRect = stampRect;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetailsStampRect getStampRect() {
            return this.stampRect;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesStampInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StampCount")
        public Integer stampCount;

        @NameInMap("StampDetails")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetails> stampDetails;

        public static RecognizeAllTextResponseBodyDataSubImagesStampInfo build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesStampInfo self = new RecognizeAllTextResponseBodyDataSubImagesStampInfo();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesStampInfo setStampCount(Integer stampCount) {
            this.stampCount = stampCount;
            return this;
        }
        public Integer getStampCount() {
            return this.stampCount;
        }

        public RecognizeAllTextResponseBodyDataSubImagesStampInfo setStampDetails(java.util.List<RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetails> stampDetails) {
            this.stampDetails = stampDetails;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesStampInfoStampDetails> getStampDetails() {
            return this.stampDetails;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesSubImagePoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesSubImagePoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesSubImagePoints self = new RecognizeAllTextResponseBodyDataSubImagesSubImagePoints();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesSubImagePoints setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesSubImagePoints setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesSubImageRect extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CenterX")
        public Integer centerX;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("CenterY")
        public Integer centerY;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesSubImageRect build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesSubImageRect self = new RecognizeAllTextResponseBodyDataSubImagesSubImageRect();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesSubImageRect setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesSubImageRect setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesSubImageRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesSubImageRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellPoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellPoints self = new RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellPoints setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellPoints setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellRect extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CenterX")
        public Integer centerX;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("CenterY")
        public Integer centerY;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellRect build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellRect self = new RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellRect();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellRect setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellRect setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetails extends TeaModel {
        @NameInMap("BlockList")
        public java.util.List<Integer> blockList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CellAngle")
        public Integer cellAngle;

        @NameInMap("CellContent")
        public String cellContent;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CellId")
        public Integer cellId;

        @NameInMap("CellPoints")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellPoints> cellPoints;

        @NameInMap("CellRect")
        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellRect cellRect;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ColumnEnd")
        public Integer columnEnd;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ColumnStart")
        public Integer columnStart;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RowEnd")
        public Integer rowEnd;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RowStart")
        public Integer rowStart;

        public static RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetails build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetails self = new RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetails();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetails setBlockList(java.util.List<Integer> blockList) {
            this.blockList = blockList;
            return this;
        }
        public java.util.List<Integer> getBlockList() {
            return this.blockList;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetails setCellAngle(Integer cellAngle) {
            this.cellAngle = cellAngle;
            return this;
        }
        public Integer getCellAngle() {
            return this.cellAngle;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetails setCellContent(String cellContent) {
            this.cellContent = cellContent;
            return this;
        }
        public String getCellContent() {
            return this.cellContent;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetails setCellId(Integer cellId) {
            this.cellId = cellId;
            return this;
        }
        public Integer getCellId() {
            return this.cellId;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetails setCellPoints(java.util.List<RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellPoints> cellPoints) {
            this.cellPoints = cellPoints;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellPoints> getCellPoints() {
            return this.cellPoints;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetails setCellRect(RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellRect cellRect) {
            this.cellRect = cellRect;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellRect getCellRect() {
            return this.cellRect;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetails setColumnEnd(Integer columnEnd) {
            this.columnEnd = columnEnd;
            return this;
        }
        public Integer getColumnEnd() {
            return this.columnEnd;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetails setColumnStart(Integer columnStart) {
            this.columnStart = columnStart;
            return this;
        }
        public Integer getColumnStart() {
            return this.columnStart;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetails setRowEnd(Integer rowEnd) {
            this.rowEnd = rowEnd;
            return this;
        }
        public Integer getRowEnd() {
            return this.rowEnd;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetails setRowStart(Integer rowStart) {
            this.rowStart = rowStart;
            return this;
        }
        public Integer getRowStart() {
            return this.rowStart;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsFooter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BlockId")
        public Integer blockId;

        @NameInMap("Contents")
        public java.util.List<String> contents;

        public static RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsFooter build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsFooter self = new RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsFooter();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsFooter setBlockId(Integer blockId) {
            this.blockId = blockId;
            return this;
        }
        public Integer getBlockId() {
            return this.blockId;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsFooter setContents(java.util.List<String> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<String> getContents() {
            return this.contents;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BlockId")
        public Integer blockId;

        @NameInMap("Contents")
        public java.util.List<String> contents;

        public static RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsHeader build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsHeader self = new RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsHeader();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsHeader setBlockId(Integer blockId) {
            this.blockId = blockId;
            return this;
        }
        public Integer getBlockId() {
            return this.blockId;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsHeader setContents(java.util.List<String> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<String> getContents() {
            return this.contents;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsTablePoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsTablePoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsTablePoints self = new RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsTablePoints();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsTablePoints setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsTablePoints setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsTableRect extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CenterX")
        public Integer centerX;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("CenterY")
        public Integer centerY;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsTableRect build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsTableRect self = new RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsTableRect();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsTableRect setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsTableRect setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsTableRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsTableRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("CellCount")
        public Integer cellCount;

        @NameInMap("CellDetails")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetails> cellDetails;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ColumnCount")
        public Integer columnCount;

        @NameInMap("Footer")
        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsFooter footer;

        @NameInMap("Header")
        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsHeader header;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RowCount")
        public Integer rowCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TableId")
        public Integer tableId;

        @NameInMap("TablePoints")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsTablePoints> tablePoints;

        @NameInMap("TableRect")
        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsTableRect tableRect;

        public static RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetails build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetails self = new RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetails();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetails setCellCount(Integer cellCount) {
            this.cellCount = cellCount;
            return this;
        }
        public Integer getCellCount() {
            return this.cellCount;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetails setCellDetails(java.util.List<RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetails> cellDetails) {
            this.cellDetails = cellDetails;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetails> getCellDetails() {
            return this.cellDetails;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetails setColumnCount(Integer columnCount) {
            this.columnCount = columnCount;
            return this;
        }
        public Integer getColumnCount() {
            return this.columnCount;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetails setFooter(RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsFooter footer) {
            this.footer = footer;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsFooter getFooter() {
            return this.footer;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetails setHeader(RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsHeader header) {
            this.header = header;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsHeader getHeader() {
            return this.header;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetails setRowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Integer getRowCount() {
            return this.rowCount;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetails setTableId(Integer tableId) {
            this.tableId = tableId;
            return this;
        }
        public Integer getTableId() {
            return this.tableId;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetails setTablePoints(java.util.List<RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsTablePoints> tablePoints) {
            this.tablePoints = tablePoints;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsTablePoints> getTablePoints() {
            return this.tablePoints;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetails setTableRect(RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsTableRect tableRect) {
            this.tableRect = tableRect;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsTableRect getTableRect() {
            return this.tableRect;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesTableInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TableCount")
        public Integer tableCount;

        @NameInMap("TableDetails")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetails> tableDetails;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example.xlsx">https://example.xlsx</a></p>
         */
        @NameInMap("TableExcel")
        public String tableExcel;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example.html">https://example.html</a></p>
         */
        @NameInMap("TableHtml")
        public String tableHtml;

        public static RecognizeAllTextResponseBodyDataSubImagesTableInfo build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesTableInfo self = new RecognizeAllTextResponseBodyDataSubImagesTableInfo();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfo setTableCount(Integer tableCount) {
            this.tableCount = tableCount;
            return this;
        }
        public Integer getTableCount() {
            return this.tableCount;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfo setTableDetails(java.util.List<RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetails> tableDetails) {
            this.tableDetails = tableDetails;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetails> getTableDetails() {
            return this.tableDetails;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfo setTableExcel(String tableExcel) {
            this.tableExcel = tableExcel;
            return this;
        }
        public String getTableExcel() {
            return this.tableExcel;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfo setTableHtml(String tableHtml) {
            this.tableHtml = tableHtml;
            return this;
        }
        public String getTableHtml() {
            return this.tableHtml;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Angle")
        public Integer angle;

        @NameInMap("BarCodeInfo")
        public RecognizeAllTextResponseBodyDataSubImagesBarCodeInfo barCodeInfo;

        @NameInMap("BlockInfo")
        public RecognizeAllTextResponseBodyDataSubImagesBlockInfo blockInfo;

        @NameInMap("FigureInfo")
        public java.util.Map<String, DataSubImagesFigureInfoValue> figureInfo;

        @NameInMap("KvInfo")
        public RecognizeAllTextResponseBodyDataSubImagesKvInfo kvInfo;

        @NameInMap("ParagraphInfo")
        public RecognizeAllTextResponseBodyDataSubImagesParagraphInfo paragraphInfo;

        @NameInMap("QrCodeInfo")
        public RecognizeAllTextResponseBodyDataSubImagesQrCodeInfo qrCodeInfo;

        @NameInMap("QualityInfo")
        public RecognizeAllTextResponseBodyDataSubImagesQualityInfo qualityInfo;

        @NameInMap("RowInfo")
        public RecognizeAllTextResponseBodyDataSubImagesRowInfo rowInfo;

        @NameInMap("StampInfo")
        public RecognizeAllTextResponseBodyDataSubImagesStampInfo stampInfo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SubImageId")
        public Integer subImageId;

        @NameInMap("SubImagePoints")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesSubImagePoints> subImagePoints;

        @NameInMap("SubImageRect")
        public RecognizeAllTextResponseBodyDataSubImagesSubImageRect subImageRect;

        @NameInMap("TableInfo")
        public RecognizeAllTextResponseBodyDataSubImagesTableInfo tableInfo;

        @NameInMap("Type")
        public String type;

        public static RecognizeAllTextResponseBodyDataSubImages build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImages self = new RecognizeAllTextResponseBodyDataSubImages();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImages setAngle(Integer angle) {
            this.angle = angle;
            return this;
        }
        public Integer getAngle() {
            return this.angle;
        }

        public RecognizeAllTextResponseBodyDataSubImages setBarCodeInfo(RecognizeAllTextResponseBodyDataSubImagesBarCodeInfo barCodeInfo) {
            this.barCodeInfo = barCodeInfo;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesBarCodeInfo getBarCodeInfo() {
            return this.barCodeInfo;
        }

        public RecognizeAllTextResponseBodyDataSubImages setBlockInfo(RecognizeAllTextResponseBodyDataSubImagesBlockInfo blockInfo) {
            this.blockInfo = blockInfo;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesBlockInfo getBlockInfo() {
            return this.blockInfo;
        }

        public RecognizeAllTextResponseBodyDataSubImages setFigureInfo(java.util.Map<String, DataSubImagesFigureInfoValue> figureInfo) {
            this.figureInfo = figureInfo;
            return this;
        }
        public java.util.Map<String, DataSubImagesFigureInfoValue> getFigureInfo() {
            return this.figureInfo;
        }

        public RecognizeAllTextResponseBodyDataSubImages setKvInfo(RecognizeAllTextResponseBodyDataSubImagesKvInfo kvInfo) {
            this.kvInfo = kvInfo;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesKvInfo getKvInfo() {
            return this.kvInfo;
        }

        public RecognizeAllTextResponseBodyDataSubImages setParagraphInfo(RecognizeAllTextResponseBodyDataSubImagesParagraphInfo paragraphInfo) {
            this.paragraphInfo = paragraphInfo;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesParagraphInfo getParagraphInfo() {
            return this.paragraphInfo;
        }

        public RecognizeAllTextResponseBodyDataSubImages setQrCodeInfo(RecognizeAllTextResponseBodyDataSubImagesQrCodeInfo qrCodeInfo) {
            this.qrCodeInfo = qrCodeInfo;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesQrCodeInfo getQrCodeInfo() {
            return this.qrCodeInfo;
        }

        public RecognizeAllTextResponseBodyDataSubImages setQualityInfo(RecognizeAllTextResponseBodyDataSubImagesQualityInfo qualityInfo) {
            this.qualityInfo = qualityInfo;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesQualityInfo getQualityInfo() {
            return this.qualityInfo;
        }

        public RecognizeAllTextResponseBodyDataSubImages setRowInfo(RecognizeAllTextResponseBodyDataSubImagesRowInfo rowInfo) {
            this.rowInfo = rowInfo;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesRowInfo getRowInfo() {
            return this.rowInfo;
        }

        public RecognizeAllTextResponseBodyDataSubImages setStampInfo(RecognizeAllTextResponseBodyDataSubImagesStampInfo stampInfo) {
            this.stampInfo = stampInfo;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesStampInfo getStampInfo() {
            return this.stampInfo;
        }

        public RecognizeAllTextResponseBodyDataSubImages setSubImageId(Integer subImageId) {
            this.subImageId = subImageId;
            return this;
        }
        public Integer getSubImageId() {
            return this.subImageId;
        }

        public RecognizeAllTextResponseBodyDataSubImages setSubImagePoints(java.util.List<RecognizeAllTextResponseBodyDataSubImagesSubImagePoints> subImagePoints) {
            this.subImagePoints = subImagePoints;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesSubImagePoints> getSubImagePoints() {
            return this.subImagePoints;
        }

        public RecognizeAllTextResponseBodyDataSubImages setSubImageRect(RecognizeAllTextResponseBodyDataSubImagesSubImageRect subImageRect) {
            this.subImageRect = subImageRect;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesSubImageRect getSubImageRect() {
            return this.subImageRect;
        }

        public RecognizeAllTextResponseBodyDataSubImages setTableInfo(RecognizeAllTextResponseBodyDataSubImagesTableInfo tableInfo) {
            this.tableInfo = tableInfo;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesTableInfo getTableInfo() {
            return this.tableInfo;
        }

        public RecognizeAllTextResponseBodyDataSubImages setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RecognizeAllTextResponseBodyData extends TeaModel {
        @NameInMap("AlgoServer")
        public java.util.List<String> algoServer;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("AlgoVersion")
        public String algoVersion;

        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("DebugInfo")
        public Object debugInfo;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsMixedMode")
        public Boolean isMixedMode;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example.xlsx">https://example.xlsx</a></p>
         */
        @NameInMap("KvExcelUrl")
        public String kvExcelUrl;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SubImageCount")
        public Integer subImageCount;

        @NameInMap("SubImages")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImages> subImages;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Width")
        public Integer width;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("XmlResult")
        public String xmlResult;

        public static RecognizeAllTextResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyData self = new RecognizeAllTextResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyData setAlgoServer(java.util.List<String> algoServer) {
            this.algoServer = algoServer;
            return this;
        }
        public java.util.List<String> getAlgoServer() {
            return this.algoServer;
        }

        public RecognizeAllTextResponseBodyData setAlgoVersion(String algoVersion) {
            this.algoVersion = algoVersion;
            return this;
        }
        public String getAlgoVersion() {
            return this.algoVersion;
        }

        public RecognizeAllTextResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RecognizeAllTextResponseBodyData setDebugInfo(Object debugInfo) {
            this.debugInfo = debugInfo;
            return this;
        }
        public Object getDebugInfo() {
            return this.debugInfo;
        }

        public RecognizeAllTextResponseBodyData setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyData setIsMixedMode(Boolean isMixedMode) {
            this.isMixedMode = isMixedMode;
            return this;
        }
        public Boolean getIsMixedMode() {
            return this.isMixedMode;
        }

        public RecognizeAllTextResponseBodyData setKvExcelUrl(String kvExcelUrl) {
            this.kvExcelUrl = kvExcelUrl;
            return this;
        }
        public String getKvExcelUrl() {
            return this.kvExcelUrl;
        }

        public RecognizeAllTextResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public RecognizeAllTextResponseBodyData setSubImageCount(Integer subImageCount) {
            this.subImageCount = subImageCount;
            return this;
        }
        public Integer getSubImageCount() {
            return this.subImageCount;
        }

        public RecognizeAllTextResponseBodyData setSubImages(java.util.List<RecognizeAllTextResponseBodyDataSubImages> subImages) {
            this.subImages = subImages;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImages> getSubImages() {
            return this.subImages;
        }

        public RecognizeAllTextResponseBodyData setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public RecognizeAllTextResponseBodyData setXmlResult(String xmlResult) {
            this.xmlResult = xmlResult;
            return this;
        }
        public String getXmlResult() {
            return this.xmlResult;
        }

    }

}
