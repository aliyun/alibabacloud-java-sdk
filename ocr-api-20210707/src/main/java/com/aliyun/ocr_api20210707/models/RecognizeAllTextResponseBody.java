// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeAllTextResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RecognizeAllTextResponseBodyData data;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("X")
        public Integer x;

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
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

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
        @NameInMap("BarCodeAngle")
        public Integer barCodeAngle;

        @NameInMap("BarCodePoints")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodePoints> barCodePoints;

        @NameInMap("BarCodeRect")
        public RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetailsBarCodeRect barCodeRect;

        @NameInMap("Data")
        public byte[] data;

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

        public RecognizeAllTextResponseBodyDataSubImagesBarCodeInfoBarCodeDetails setData(byte[] data) {
            this.data = data;
            return this;
        }
        public byte[] getData() {
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
        @NameInMap("X")
        public Integer x;

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
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

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
        @NameInMap("X")
        public Integer x;

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
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

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
        @NameInMap("CharConfidence")
        public Integer charConfidence;

        @NameInMap("CharContent")
        public String charContent;

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
        @NameInMap("BlockAngle")
        public Integer blockAngle;

        @NameInMap("BlockConfidence")
        public Integer blockConfidence;

        @NameInMap("BlockContent")
        public String blockContent;

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

    public static class RecognizeAllTextResponseBodyDataSubImagesDocLayoutsLayoutPoints extends TeaModel {
        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesDocLayoutsLayoutPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesDocLayoutsLayoutPoints self = new RecognizeAllTextResponseBodyDataSubImagesDocLayoutsLayoutPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocLayoutsLayoutPoints setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocLayoutsLayoutPoints setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesDocLayoutsLayoutRect extends TeaModel {
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesDocLayoutsLayoutRect build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesDocLayoutsLayoutRect self = new RecognizeAllTextResponseBodyDataSubImagesDocLayoutsLayoutRect();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocLayoutsLayoutRect setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocLayoutsLayoutRect setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocLayoutsLayoutRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocLayoutsLayoutRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesDocLayouts extends TeaModel {
        @NameInMap("LayoutPoints")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesDocLayoutsLayoutPoints> layoutPoints;

        @NameInMap("LayoutRect")
        public RecognizeAllTextResponseBodyDataSubImagesDocLayoutsLayoutRect layoutRect;

        @NameInMap("LayoutType")
        public String layoutType;

        public static RecognizeAllTextResponseBodyDataSubImagesDocLayouts build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesDocLayouts self = new RecognizeAllTextResponseBodyDataSubImagesDocLayouts();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocLayouts setLayoutPoints(java.util.List<RecognizeAllTextResponseBodyDataSubImagesDocLayoutsLayoutPoints> layoutPoints) {
            this.layoutPoints = layoutPoints;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesDocLayoutsLayoutPoints> getLayoutPoints() {
            return this.layoutPoints;
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocLayouts setLayoutRect(RecognizeAllTextResponseBodyDataSubImagesDocLayoutsLayoutRect layoutRect) {
            this.layoutRect = layoutRect;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesDocLayoutsLayoutRect getLayoutRect() {
            return this.layoutRect;
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocLayouts setLayoutType(String layoutType) {
            this.layoutType = layoutType;
            return this;
        }
        public String getLayoutType() {
            return this.layoutType;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesDocSpecialTextsSpecialTextPos extends TeaModel {
        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesDocSpecialTextsSpecialTextPos build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesDocSpecialTextsSpecialTextPos self = new RecognizeAllTextResponseBodyDataSubImagesDocSpecialTextsSpecialTextPos();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocSpecialTextsSpecialTextPos setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocSpecialTextsSpecialTextPos setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesDocSpecialTextsSpecialTextRect extends TeaModel {
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesDocSpecialTextsSpecialTextRect build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesDocSpecialTextsSpecialTextRect self = new RecognizeAllTextResponseBodyDataSubImagesDocSpecialTextsSpecialTextRect();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocSpecialTextsSpecialTextRect setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocSpecialTextsSpecialTextRect setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocSpecialTextsSpecialTextRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocSpecialTextsSpecialTextRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesDocSpecialTexts extends TeaModel {
        @NameInMap("SpecialTextPos")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesDocSpecialTextsSpecialTextPos> specialTextPos;

        @NameInMap("SpecialTextRect")
        public RecognizeAllTextResponseBodyDataSubImagesDocSpecialTextsSpecialTextRect specialTextRect;

        @NameInMap("SpecialTextType")
        public String specialTextType;

        public static RecognizeAllTextResponseBodyDataSubImagesDocSpecialTexts build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesDocSpecialTexts self = new RecognizeAllTextResponseBodyDataSubImagesDocSpecialTexts();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocSpecialTexts setSpecialTextPos(java.util.List<RecognizeAllTextResponseBodyDataSubImagesDocSpecialTextsSpecialTextPos> specialTextPos) {
            this.specialTextPos = specialTextPos;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesDocSpecialTextsSpecialTextPos> getSpecialTextPos() {
            return this.specialTextPos;
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocSpecialTexts setSpecialTextRect(RecognizeAllTextResponseBodyDataSubImagesDocSpecialTextsSpecialTextRect specialTextRect) {
            this.specialTextRect = specialTextRect;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesDocSpecialTextsSpecialTextRect getSpecialTextRect() {
            return this.specialTextRect;
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocSpecialTexts setSpecialTextType(String specialTextType) {
            this.specialTextType = specialTextType;
            return this;
        }
        public String getSpecialTextType() {
            return this.specialTextType;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesDocSubFieldSubFieldPos extends TeaModel {
        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesDocSubFieldSubFieldPos build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesDocSubFieldSubFieldPos self = new RecognizeAllTextResponseBodyDataSubImagesDocSubFieldSubFieldPos();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocSubFieldSubFieldPos setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocSubFieldSubFieldPos setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesDocSubFieldSubFieldRect extends TeaModel {
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesDocSubFieldSubFieldRect build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesDocSubFieldSubFieldRect self = new RecognizeAllTextResponseBodyDataSubImagesDocSubFieldSubFieldRect();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocSubFieldSubFieldRect setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocSubFieldSubFieldRect setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocSubFieldSubFieldRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocSubFieldSubFieldRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesDocSubField extends TeaModel {
        @NameInMap("SubFieldPos")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesDocSubFieldSubFieldPos> subFieldPos;

        @NameInMap("SubFieldRect")
        public RecognizeAllTextResponseBodyDataSubImagesDocSubFieldSubFieldRect subFieldRect;

        @NameInMap("SubFieldType")
        public String subFieldType;

        public static RecognizeAllTextResponseBodyDataSubImagesDocSubField build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesDocSubField self = new RecognizeAllTextResponseBodyDataSubImagesDocSubField();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocSubField setSubFieldPos(java.util.List<RecognizeAllTextResponseBodyDataSubImagesDocSubFieldSubFieldPos> subFieldPos) {
            this.subFieldPos = subFieldPos;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesDocSubFieldSubFieldPos> getSubFieldPos() {
            return this.subFieldPos;
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocSubField setSubFieldRect(RecognizeAllTextResponseBodyDataSubImagesDocSubFieldSubFieldRect subFieldRect) {
            this.subFieldRect = subFieldRect;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesDocSubFieldSubFieldRect getSubFieldRect() {
            return this.subFieldRect;
        }

        public RecognizeAllTextResponseBodyDataSubImagesDocSubField setSubFieldType(String subFieldType) {
            this.subFieldType = subFieldType;
            return this;
        }
        public String getSubFieldType() {
            return this.subFieldType;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesKvInfo extends TeaModel {
        @NameInMap("Data")
        public Object data;

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

    public static class RecognizeAllTextResponseBodyDataSubImagesMathInfosMathInfoPoints extends TeaModel {
        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesMathInfosMathInfoPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesMathInfosMathInfoPoints self = new RecognizeAllTextResponseBodyDataSubImagesMathInfosMathInfoPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesMathInfosMathInfoPoints setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesMathInfosMathInfoPoints setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesMathInfosMathInfoRect extends TeaModel {
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesMathInfosMathInfoRect build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesMathInfosMathInfoRect self = new RecognizeAllTextResponseBodyDataSubImagesMathInfosMathInfoRect();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesMathInfosMathInfoRect setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesMathInfosMathInfoRect setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesMathInfosMathInfoRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesMathInfosMathInfoRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesMathInfos extends TeaModel {
        @NameInMap("MathInfoPoints")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesMathInfosMathInfoPoints> mathInfoPoints;

        @NameInMap("MathInfoRect")
        public RecognizeAllTextResponseBodyDataSubImagesMathInfosMathInfoRect mathInfoRect;

        @NameInMap("Result")
        public String result;

        @NameInMap("Title")
        public String title;

        public static RecognizeAllTextResponseBodyDataSubImagesMathInfos build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesMathInfos self = new RecognizeAllTextResponseBodyDataSubImagesMathInfos();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesMathInfos setMathInfoPoints(java.util.List<RecognizeAllTextResponseBodyDataSubImagesMathInfosMathInfoPoints> mathInfoPoints) {
            this.mathInfoPoints = mathInfoPoints;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesMathInfosMathInfoPoints> getMathInfoPoints() {
            return this.mathInfoPoints;
        }

        public RecognizeAllTextResponseBodyDataSubImagesMathInfos setMathInfoRect(RecognizeAllTextResponseBodyDataSubImagesMathInfosMathInfoRect mathInfoRect) {
            this.mathInfoRect = mathInfoRect;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesMathInfosMathInfoRect getMathInfoRect() {
            return this.mathInfoRect;
        }

        public RecognizeAllTextResponseBodyDataSubImagesMathInfos setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public RecognizeAllTextResponseBodyDataSubImagesMathInfos setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesNewStyleDataDocInfoPages extends TeaModel {
        @NameInMap("ImageWidth")
        public Integer imageWidth;

        @NameInMap("InageHeight")
        public Integer inageHeight;

        @NameInMap("PageIdAllDocs")
        public Integer pageIdAllDocs;

        @NameInMap("PageIdCurDoc")
        public Integer pageIdCurDoc;

        public static RecognizeAllTextResponseBodyDataSubImagesNewStyleDataDocInfoPages build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesNewStyleDataDocInfoPages self = new RecognizeAllTextResponseBodyDataSubImagesNewStyleDataDocInfoPages();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataDocInfoPages setImageWidth(Integer imageWidth) {
            this.imageWidth = imageWidth;
            return this;
        }
        public Integer getImageWidth() {
            return this.imageWidth;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataDocInfoPages setInageHeight(Integer inageHeight) {
            this.inageHeight = inageHeight;
            return this;
        }
        public Integer getInageHeight() {
            return this.inageHeight;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataDocInfoPages setPageIdAllDocs(Integer pageIdAllDocs) {
            this.pageIdAllDocs = pageIdAllDocs;
            return this;
        }
        public Integer getPageIdAllDocs() {
            return this.pageIdAllDocs;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataDocInfoPages setPageIdCurDoc(Integer pageIdCurDoc) {
            this.pageIdCurDoc = pageIdCurDoc;
            return this;
        }
        public Integer getPageIdCurDoc() {
            return this.pageIdCurDoc;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesNewStyleDataDocInfo extends TeaModel {
        @NameInMap("Pages")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesNewStyleDataDocInfoPages> pages;

        public static RecognizeAllTextResponseBodyDataSubImagesNewStyleDataDocInfo build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesNewStyleDataDocInfo self = new RecognizeAllTextResponseBodyDataSubImagesNewStyleDataDocInfo();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataDocInfo setPages(java.util.List<RecognizeAllTextResponseBodyDataSubImagesNewStyleDataDocInfoPages> pages) {
            this.pages = pages;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesNewStyleDataDocInfoPages> getPages() {
            return this.pages;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfosLayoutPoints extends TeaModel {
        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfosLayoutPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfosLayoutPoints self = new RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfosLayoutPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfosLayoutPoints setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfosLayoutPoints setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfosLayoutRect extends TeaModel {
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfosLayoutRect build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfosLayoutRect self = new RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfosLayoutRect();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfosLayoutRect setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfosLayoutRect setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfosLayoutRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfosLayoutRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfos extends TeaModel {
        @NameInMap("Alignment")
        public String alignment;

        @NameInMap("Index")
        public Integer index;

        @NameInMap("LayoutPoints")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfosLayoutPoints> layoutPoints;

        @NameInMap("LayoutRect")
        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfosLayoutRect layoutRect;

        @NameInMap("PageNum")
        public java.util.List<Integer> pageNum;

        @NameInMap("Source")
        public String source;

        @NameInMap("SubType")
        public String subType;

        @NameInMap("Text")
        public String text;

        @NameInMap("Type")
        public String type;

        @NameInMap("UniqueID")
        public String uniqueID;

        public static RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfos build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfos self = new RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfos();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfos setAlignment(String alignment) {
            this.alignment = alignment;
            return this;
        }
        public String getAlignment() {
            return this.alignment;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfos setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfos setLayoutPoints(java.util.List<RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfosLayoutPoints> layoutPoints) {
            this.layoutPoints = layoutPoints;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfosLayoutPoints> getLayoutPoints() {
            return this.layoutPoints;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfos setLayoutRect(RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfosLayoutRect layoutRect) {
            this.layoutRect = layoutRect;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfosLayoutRect getLayoutRect() {
            return this.layoutRect;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfos setPageNum(java.util.List<Integer> pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public java.util.List<Integer> getPageNum() {
            return this.pageNum;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfos setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfos setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfos setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfos setUniqueID(String uniqueID) {
            this.uniqueID = uniqueID;
            return this;
        }
        public String getUniqueID() {
            return this.uniqueID;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesNewStyleDataStyles extends TeaModel {
        @NameInMap("Bold")
        public Boolean bold;

        @NameInMap("CharScale")
        public Float charScale;

        @NameInMap("Color")
        public String color;

        @NameInMap("DeleteLine")
        public Boolean deleteLine;

        @NameInMap("FontName")
        public String fontName;

        @NameInMap("FontSize")
        public Integer fontSize;

        @NameInMap("Italic")
        public Boolean italic;

        @NameInMap("StyleId")
        public Integer styleId;

        @NameInMap("Underline")
        public Boolean underline;

        public static RecognizeAllTextResponseBodyDataSubImagesNewStyleDataStyles build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesNewStyleDataStyles self = new RecognizeAllTextResponseBodyDataSubImagesNewStyleDataStyles();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataStyles setBold(Boolean bold) {
            this.bold = bold;
            return this;
        }
        public Boolean getBold() {
            return this.bold;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataStyles setCharScale(Float charScale) {
            this.charScale = charScale;
            return this;
        }
        public Float getCharScale() {
            return this.charScale;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataStyles setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataStyles setDeleteLine(Boolean deleteLine) {
            this.deleteLine = deleteLine;
            return this;
        }
        public Boolean getDeleteLine() {
            return this.deleteLine;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataStyles setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataStyles setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataStyles setItalic(Boolean italic) {
            this.italic = italic;
            return this;
        }
        public Boolean getItalic() {
            return this.italic;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataStyles setStyleId(Integer styleId) {
            this.styleId = styleId;
            return this;
        }
        public Integer getStyleId() {
            return this.styleId;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataStyles setUnderline(Boolean underline) {
            this.underline = underline;
            return this;
        }
        public Boolean getUnderline() {
            return this.underline;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesNewStyleData extends TeaModel {
        @NameInMap("DocInfo")
        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataDocInfo docInfo;

        @NameInMap("LayoutInfos")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfos> layoutInfos;

        @NameInMap("Styles")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesNewStyleDataStyles> styles;

        public static RecognizeAllTextResponseBodyDataSubImagesNewStyleData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesNewStyleData self = new RecognizeAllTextResponseBodyDataSubImagesNewStyleData();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleData setDocInfo(RecognizeAllTextResponseBodyDataSubImagesNewStyleDataDocInfo docInfo) {
            this.docInfo = docInfo;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesNewStyleDataDocInfo getDocInfo() {
            return this.docInfo;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleData setLayoutInfos(java.util.List<RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfos> layoutInfos) {
            this.layoutInfos = layoutInfos;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesNewStyleDataLayoutInfos> getLayoutInfos() {
            return this.layoutInfos;
        }

        public RecognizeAllTextResponseBodyDataSubImagesNewStyleData setStyles(java.util.List<RecognizeAllTextResponseBodyDataSubImagesNewStyleDataStyles> styles) {
            this.styles = styles;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesNewStyleDataStyles> getStyles() {
            return this.styles;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsBlockPoints extends TeaModel {
        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsBlockPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsBlockPoints self = new RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsBlockPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsBlockPoints setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsBlockPoints setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsBlockRect extends TeaModel {
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsBlockRect build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsBlockRect self = new RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsBlockRect();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsBlockRect setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsBlockRect setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsBlockRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsBlockRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfoCharPoints extends TeaModel {
        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfoCharPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfoCharPoints self = new RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfoCharPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfoCharPoints setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfoCharPoints setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfoCharRect extends TeaModel {
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfoCharRect build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfoCharRect self = new RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfoCharRect();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfoCharRect setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfoCharRect setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfoCharRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfoCharRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfo extends TeaModel {
        @NameInMap("CharId")
        public Integer charId;

        @NameInMap("CharPoints")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfoCharPoints> charPoints;

        @NameInMap("CharRect")
        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfoCharRect charRect;

        @NameInMap("Confidence")
        public Integer confidence;

        @NameInMap("Content")
        public String content;

        public static RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfo build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfo self = new RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfo();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfo setCharId(Integer charId) {
            this.charId = charId;
            return this;
        }
        public Integer getCharId() {
            return this.charId;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfo setCharPoints(java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfoCharPoints> charPoints) {
            this.charPoints = charPoints;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfoCharPoints> getCharPoints() {
            return this.charPoints;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfo setCharRect(RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfoCharRect charRect) {
            this.charRect = charRect;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfoCharRect getCharRect() {
            return this.charRect;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfo setConfidence(Integer confidence) {
            this.confidence = confidence;
            return this;
        }
        public Integer getConfidence() {
            return this.confidence;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetails extends TeaModel {
        @NameInMap("Angle")
        public Integer angle;

        @NameInMap("BlockId")
        public Integer blockId;

        @NameInMap("BlockPoints")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsBlockPoints> blockPoints;

        @NameInMap("BlockRect")
        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsBlockRect blockRect;

        @NameInMap("CharInfo")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfo> charInfo;

        @NameInMap("Confidence")
        public Integer confidence;

        @NameInMap("Content")
        public String content;

        public static RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetails build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetails self = new RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetails();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetails setAngle(Integer angle) {
            this.angle = angle;
            return this;
        }
        public Integer getAngle() {
            return this.angle;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetails setBlockId(Integer blockId) {
            this.blockId = blockId;
            return this;
        }
        public Integer getBlockId() {
            return this.blockId;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetails setBlockPoints(java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsBlockPoints> blockPoints) {
            this.blockPoints = blockPoints;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsBlockPoints> getBlockPoints() {
            return this.blockPoints;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetails setBlockRect(RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsBlockRect blockRect) {
            this.blockRect = blockRect;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsBlockRect getBlockRect() {
            return this.blockRect;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetails setCharInfo(java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfo> charInfo) {
            this.charInfo = charInfo;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetailsCharInfo> getCharInfo() {
            return this.charInfo;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetails setConfidence(Integer confidence) {
            this.confidence = confidence;
            return this;
        }
        public Integer getConfidence() {
            return this.confidence;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetails setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfo extends TeaModel {
        @NameInMap("BlockCount")
        public Integer blockCount;

        @NameInMap("BlockDetails")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetails> blockDetails;

        public static RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfo build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfo self = new RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfo();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfo setBlockCount(Integer blockCount) {
            this.blockCount = blockCount;
            return this;
        }
        public Integer getBlockCount() {
            return this.blockCount;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfo setBlockDetails(java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetails> blockDetails) {
            this.blockDetails = blockDetails;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfoBlockDetails> getBlockDetails() {
            return this.blockDetails;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfosContentPoints extends TeaModel {
        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfosContentPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfosContentPoints self = new RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfosContentPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfosContentPoints setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfosContentPoints setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfosContentRect extends TeaModel {
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfosContentRect build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfosContentRect self = new RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfosContentRect();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfosContentRect setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfosContentRect setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfosContentRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfosContentRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfos extends TeaModel {
        @NameInMap("ContentPoints")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfosContentPoints> contentPoints;

        @NameInMap("ContentRect")
        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfosContentRect contentRect;

        @NameInMap("DocIndex")
        public Integer docIndex;

        public static RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfos build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfos self = new RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfos();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfos setContentPoints(java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfosContentPoints> contentPoints) {
            this.contentPoints = contentPoints;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfosContentPoints> getContentPoints() {
            return this.contentPoints;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfos setContentRect(RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfosContentRect contentRect) {
            this.contentRect = contentRect;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfosContentRect getContentRect() {
            return this.contentRect;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfos setDocIndex(Integer docIndex) {
            this.docIndex = docIndex;
            return this;
        }
        public Integer getDocIndex() {
            return this.docIndex;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfos extends TeaModel {
        @NameInMap("BlockInfo")
        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfo blockInfo;

        @NameInMap("Content")
        public String content;

        @NameInMap("ContentInfos")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfos> contentInfos;

        @NameInMap("Ids")
        public java.util.List<Integer> ids;

        @NameInMap("IsMultiPage")
        public Boolean isMultiPage;

        public static RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfos build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfos self = new RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfos();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfos setBlockInfo(RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfo blockInfo) {
            this.blockInfo = blockInfo;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosBlockInfo getBlockInfo() {
            return this.blockInfo;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfos setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfos setContentInfos(java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfos> contentInfos) {
            this.contentInfos = contentInfos;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfosContentInfos> getContentInfos() {
            return this.contentInfos;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfos setIds(java.util.List<Integer> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<Integer> getIds() {
            return this.ids;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfos setIsMultiPage(Boolean isMultiPage) {
            this.isMultiPage = isMultiPage;
            return this;
        }
        public Boolean getIsMultiPage() {
            return this.isMultiPage;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPageInfos extends TeaModel {
        @NameInMap("Angle")
        public Integer angle;

        @NameInMap("DocIndex")
        public Integer docIndex;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("PageId")
        public Integer pageId;

        @NameInMap("SubjectInfos")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfos> subjectInfos;

        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesPageInfos build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPageInfos self = new RecognizeAllTextResponseBodyDataSubImagesPageInfos();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfos setAngle(Integer angle) {
            this.angle = angle;
            return this;
        }
        public Integer getAngle() {
            return this.angle;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfos setDocIndex(Integer docIndex) {
            this.docIndex = docIndex;
            return this;
        }
        public Integer getDocIndex() {
            return this.docIndex;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfos setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfos setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfos setSubjectInfos(java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfos> subjectInfos) {
            this.subjectInfos = subjectInfos;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfosSubjectInfos> getSubjectInfos() {
            return this.subjectInfos;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPageInfos setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesParagraphInfoParagraphDetails extends TeaModel {
        @NameInMap("BlockList")
        public java.util.List<Integer> blockList;

        @NameInMap("ParagraphContent")
        public String paragraphContent;

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

    public static class RecognizeAllTextResponseBodyDataSubImagesPartInfosPartInfoPointsList extends TeaModel {
        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesPartInfosPartInfoPointsList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPartInfosPartInfoPointsList self = new RecognizeAllTextResponseBodyDataSubImagesPartInfosPartInfoPointsList();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosPartInfoPointsList setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosPartInfoPointsList setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPartInfosPartInfoRectList extends TeaModel {
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesPartInfosPartInfoRectList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPartInfosPartInfoRectList self = new RecognizeAllTextResponseBodyDataSubImagesPartInfosPartInfoRectList();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosPartInfoRectList setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosPartInfoRectList setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosPartInfoRectList setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosPartInfoRectList setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListAnswerPointsList extends TeaModel {
        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListAnswerPointsList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListAnswerPointsList self = new RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListAnswerPointsList();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListAnswerPointsList setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListAnswerPointsList setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListAnswerRectList extends TeaModel {
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListAnswerRectList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListAnswerRectList self = new RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListAnswerRectList();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListAnswerRectList setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListAnswerRectList setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListAnswerRectList setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListAnswerRectList setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContentsContentPoints extends TeaModel {
        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContentsContentPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContentsContentPoints self = new RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContentsContentPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContentsContentPoints setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContentsContentPoints setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContentsContentRect extends TeaModel {
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContentsContentRect build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContentsContentRect self = new RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContentsContentRect();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContentsContentRect setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContentsContentRect setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContentsContentRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContentsContentRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContents extends TeaModel {
        @NameInMap("Confidence")
        public Integer confidence;

        @NameInMap("ContentPoints")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContentsContentPoints> contentPoints;

        @NameInMap("ContentRect")
        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContentsContentRect contentRect;

        @NameInMap("ContentType")
        public Integer contentType;

        @NameInMap("Option")
        public String option;

        @NameInMap("Text")
        public String text;

        public static RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContents build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContents self = new RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContents();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContents setConfidence(Integer confidence) {
            this.confidence = confidence;
            return this;
        }
        public Integer getConfidence() {
            return this.confidence;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContents setContentPoints(java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContentsContentPoints> contentPoints) {
            this.contentPoints = contentPoints;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContentsContentPoints> getContentPoints() {
            return this.contentPoints;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContents setContentRect(RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContentsContentRect contentRect) {
            this.contentRect = contentRect;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContentsContentRect getContentRect() {
            return this.contentRect;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContents setContentType(Integer contentType) {
            this.contentType = contentType;
            return this;
        }
        public Integer getContentType() {
            return this.contentType;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContents setOption(String option) {
            this.option = option;
            return this;
        }
        public String getOption() {
            return this.option;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContents setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsElementPointsList extends TeaModel {
        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsElementPointsList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsElementPointsList self = new RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsElementPointsList();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsElementPointsList setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsElementPointsList setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsElementRectList extends TeaModel {
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsElementRectList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsElementRectList self = new RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsElementRectList();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsElementRectList setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsElementRectList setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsElementRectList setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsElementRectList setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElements extends TeaModel {
        @NameInMap("Contents")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContents> contents;

        @NameInMap("ElementPointsList")
        public java.util.List<java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsElementPointsList>> elementPointsList;

        @NameInMap("ElementRectList")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsElementRectList> elementRectList;

        @NameInMap("ElementType")
        public Integer elementType;

        @NameInMap("Text")
        public String text;

        public static RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElements self = new RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElements();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElements setContents(java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContents> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsContents> getContents() {
            return this.contents;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElements setElementPointsList(java.util.List<java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsElementPointsList>> elementPointsList) {
            this.elementPointsList = elementPointsList;
            return this;
        }
        public java.util.List<java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsElementPointsList>> getElementPointsList() {
            return this.elementPointsList;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElements setElementRectList(java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsElementRectList> elementRectList) {
            this.elementRectList = elementRectList;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElementsElementRectList> getElementRectList() {
            return this.elementRectList;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElements setElementType(Integer elementType) {
            this.elementType = elementType;
            return this;
        }
        public Integer getElementType() {
            return this.elementType;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElements setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListFigurePointsList extends TeaModel {
        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListFigurePointsList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListFigurePointsList self = new RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListFigurePointsList();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListFigurePointsList setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListFigurePointsList setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListFigureRectList extends TeaModel {
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListFigureRectList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListFigureRectList self = new RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListFigureRectList();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListFigureRectList setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListFigureRectList setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListFigureRectList setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListFigureRectList setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListSubjectPointsList extends TeaModel {
        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListSubjectPointsList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListSubjectPointsList self = new RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListSubjectPointsList();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListSubjectPointsList setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListSubjectPointsList setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListSubjectRectList extends TeaModel {
        @NameInMap("CenterX")
        public String centerX;

        @NameInMap("CenterY")
        public String centerY;

        @NameInMap("Height")
        public String height;

        @NameInMap("Width")
        public String width;

        public static RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListSubjectRectList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListSubjectRectList self = new RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListSubjectRectList();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListSubjectRectList setCenterX(String centerX) {
            this.centerX = centerX;
            return this;
        }
        public String getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListSubjectRectList setCenterY(String centerY) {
            this.centerY = centerY;
            return this;
        }
        public String getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListSubjectRectList setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListSubjectRectList setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListTablePointsList extends TeaModel {
        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListTablePointsList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListTablePointsList self = new RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListTablePointsList();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListTablePointsList setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListTablePointsList setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListTableRectList extends TeaModel {
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListTableRectList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListTableRectList self = new RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListTableRectList();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListTableRectList setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListTableRectList setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListTableRectList setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListTableRectList setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectList extends TeaModel {
        @NameInMap("AnswerPointsList")
        public java.util.List<java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListAnswerPointsList>> answerPointsList;

        @NameInMap("AnswerRectList")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListAnswerRectList> answerRectList;

        @NameInMap("Confidence")
        public Integer confidence;

        @NameInMap("Elements")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElements> elements;

        @NameInMap("FigurePointsList")
        public java.util.List<java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListFigurePointsList>> figurePointsList;

        @NameInMap("FigureRectList")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListFigureRectList> figureRectList;

        @NameInMap("Index")
        public Integer index;

        @NameInMap("NumChoices")
        public Integer numChoices;

        @NameInMap("SubjectPointsList")
        public java.util.List<java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListSubjectPointsList>> subjectPointsList;

        @NameInMap("SubjectRectList")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListSubjectRectList> subjectRectList;

        @NameInMap("SubjectType")
        public Integer subjectType;

        @NameInMap("TablePointsList")
        public java.util.List<java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListTablePointsList>> tablePointsList;

        @NameInMap("TableRectList")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListTableRectList> tableRectList;

        @NameInMap("Text")
        public String text;

        public static RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectList self = new RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectList();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectList setAnswerPointsList(java.util.List<java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListAnswerPointsList>> answerPointsList) {
            this.answerPointsList = answerPointsList;
            return this;
        }
        public java.util.List<java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListAnswerPointsList>> getAnswerPointsList() {
            return this.answerPointsList;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectList setAnswerRectList(java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListAnswerRectList> answerRectList) {
            this.answerRectList = answerRectList;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListAnswerRectList> getAnswerRectList() {
            return this.answerRectList;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectList setConfidence(Integer confidence) {
            this.confidence = confidence;
            return this;
        }
        public Integer getConfidence() {
            return this.confidence;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectList setElements(java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListElements> getElements() {
            return this.elements;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectList setFigurePointsList(java.util.List<java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListFigurePointsList>> figurePointsList) {
            this.figurePointsList = figurePointsList;
            return this;
        }
        public java.util.List<java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListFigurePointsList>> getFigurePointsList() {
            return this.figurePointsList;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectList setFigureRectList(java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListFigureRectList> figureRectList) {
            this.figureRectList = figureRectList;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListFigureRectList> getFigureRectList() {
            return this.figureRectList;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectList setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectList setNumChoices(Integer numChoices) {
            this.numChoices = numChoices;
            return this;
        }
        public Integer getNumChoices() {
            return this.numChoices;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectList setSubjectPointsList(java.util.List<java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListSubjectPointsList>> subjectPointsList) {
            this.subjectPointsList = subjectPointsList;
            return this;
        }
        public java.util.List<java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListSubjectPointsList>> getSubjectPointsList() {
            return this.subjectPointsList;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectList setSubjectRectList(java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListSubjectRectList> subjectRectList) {
            this.subjectRectList = subjectRectList;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListSubjectRectList> getSubjectRectList() {
            return this.subjectRectList;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectList setSubjectType(Integer subjectType) {
            this.subjectType = subjectType;
            return this;
        }
        public Integer getSubjectType() {
            return this.subjectType;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectList setTablePointsList(java.util.List<java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListTablePointsList>> tablePointsList) {
            this.tablePointsList = tablePointsList;
            return this;
        }
        public java.util.List<java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListTablePointsList>> getTablePointsList() {
            return this.tablePointsList;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectList setTableRectList(java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListTableRectList> tableRectList) {
            this.tableRectList = tableRectList;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectListTableRectList> getTableRectList() {
            return this.tableRectList;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectList setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesPartInfos extends TeaModel {
        @NameInMap("PartInfoPointsList")
        public java.util.List<java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosPartInfoPointsList>> partInfoPointsList;

        @NameInMap("PartInfoRectList")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosPartInfoRectList> partInfoRectList;

        @NameInMap("PartTitle")
        public String partTitle;

        @NameInMap("SubjectList")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectList> subjectList;

        public static RecognizeAllTextResponseBodyDataSubImagesPartInfos build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesPartInfos self = new RecognizeAllTextResponseBodyDataSubImagesPartInfos();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfos setPartInfoPointsList(java.util.List<java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosPartInfoPointsList>> partInfoPointsList) {
            this.partInfoPointsList = partInfoPointsList;
            return this;
        }
        public java.util.List<java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosPartInfoPointsList>> getPartInfoPointsList() {
            return this.partInfoPointsList;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfos setPartInfoRectList(java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosPartInfoRectList> partInfoRectList) {
            this.partInfoRectList = partInfoRectList;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosPartInfoRectList> getPartInfoRectList() {
            return this.partInfoRectList;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfos setPartTitle(String partTitle) {
            this.partTitle = partTitle;
            return this;
        }
        public String getPartTitle() {
            return this.partTitle;
        }

        public RecognizeAllTextResponseBodyDataSubImagesPartInfos setSubjectList(java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectList> subjectList) {
            this.subjectList = subjectList;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfosSubjectList> getSubjectList() {
            return this.subjectList;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodePoints extends TeaModel {
        @NameInMap("X")
        public Integer x;

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
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

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
        @NameInMap("Angle")
        public Integer angle;

        @NameInMap("Data")
        public byte[] data;

        @NameInMap("QrCodePoints")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodePoints> qrCodePoints;

        @NameInMap("QrCodeRect")
        public RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetailsQrCodeRect qrCodeRect;

        @NameInMap("Type")
        public String type;

        public static RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetails build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetails self = new RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetails();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetails setAngle(Integer angle) {
            this.angle = angle;
            return this;
        }
        public Integer getAngle() {
            return this.angle;
        }

        public RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetails setData(byte[] data) {
            this.data = data;
            return this;
        }
        public byte[] getData() {
            return this.data;
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

        public RecognizeAllTextResponseBodyDataSubImagesQrCodeInfoQrCodeDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesQrCodeInfo extends TeaModel {
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
        @NameInMap("CompletenessScore")
        public Float completenessScore;

        @NameInMap("IsCopy")
        public Boolean isCopy;

        @NameInMap("IsReshoot")
        public Boolean isReshoot;

        @NameInMap("QualityScore")
        public Float qualityScore;

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
        @NameInMap("AntiFakeCode")
        public String antiFakeCode;

        @NameInMap("CompanyId")
        public String companyId;

        @NameInMap("OrganizationName")
        public String organizationName;

        @NameInMap("OrganizationNameEng")
        public String organizationNameEng;

        @NameInMap("OtherText")
        public String otherText;

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
        @NameInMap("X")
        public Integer x;

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
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

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
        @NameInMap("X")
        public Integer x;

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
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

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
        @NameInMap("X")
        public Integer x;

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
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

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

        @NameInMap("CellAngle")
        public Integer cellAngle;

        @NameInMap("CellContent")
        public String cellContent;

        @NameInMap("CellId")
        public Integer cellId;

        @NameInMap("CellPoints")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellPoints> cellPoints;

        @NameInMap("CellRect")
        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetailsCellRect cellRect;

        @NameInMap("ColumnEnd")
        public Integer columnEnd;

        @NameInMap("ColumnStart")
        public Integer columnStart;

        @NameInMap("RowEnd")
        public Integer rowEnd;

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

    public static class RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsFooterPoints extends TeaModel {
        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsFooterPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsFooterPoints self = new RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsFooterPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsFooterPoints setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsFooterPoints setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsFooter extends TeaModel {
        @NameInMap("BlockId")
        public Integer blockId;

        @NameInMap("Contents")
        public java.util.List<String> contents;

        @NameInMap("Points")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsFooterPoints> points;

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

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsFooter setPoints(java.util.List<RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsFooterPoints> points) {
            this.points = points;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsFooterPoints> getPoints() {
            return this.points;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsHeaderPoints extends TeaModel {
        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsHeaderPoints build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsHeaderPoints self = new RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsHeaderPoints();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsHeaderPoints setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsHeaderPoints setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsHeader extends TeaModel {
        @NameInMap("BlockId")
        public Integer blockId;

        @NameInMap("Contents")
        public java.util.List<String> contents;

        @NameInMap("Points")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsHeaderPoints> points;

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

        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsHeader setPoints(java.util.List<RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsHeaderPoints> points) {
            this.points = points;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsHeaderPoints> getPoints() {
            return this.points;
        }

    }

    public static class RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsTablePoints extends TeaModel {
        @NameInMap("X")
        public Integer x;

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
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Height")
        public Integer height;

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
        @NameInMap("CellCount")
        public Integer cellCount;

        @NameInMap("CellDetails")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsCellDetails> cellDetails;

        @NameInMap("ColumnCount")
        public Integer columnCount;

        @NameInMap("Footer")
        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsFooter footer;

        @NameInMap("Header")
        public RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetailsHeader header;

        @NameInMap("RowCount")
        public Integer rowCount;

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
        @NameInMap("TableCount")
        public Integer tableCount;

        @NameInMap("TableDetails")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesTableInfoTableDetails> tableDetails;

        @NameInMap("TableExcel")
        public String tableExcel;

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
        @NameInMap("Angle")
        public Integer angle;

        @NameInMap("BarCodeInfo")
        public RecognizeAllTextResponseBodyDataSubImagesBarCodeInfo barCodeInfo;

        @NameInMap("BlockInfo")
        public RecognizeAllTextResponseBodyDataSubImagesBlockInfo blockInfo;

        @NameInMap("DocLayouts")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesDocLayouts> docLayouts;

        @NameInMap("DocSpecialTexts")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesDocSpecialTexts> docSpecialTexts;

        @NameInMap("DocSubField")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesDocSubField> docSubField;

        @NameInMap("FigureInfo")
        public java.util.Map<String, DataSubImagesFigureInfoValue> figureInfo;

        @NameInMap("KvInfo")
        public RecognizeAllTextResponseBodyDataSubImagesKvInfo kvInfo;

        @NameInMap("MathInfos")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesMathInfos> mathInfos;

        @NameInMap("NewStyleData")
        public RecognizeAllTextResponseBodyDataSubImagesNewStyleData newStyleData;

        @NameInMap("PageId")
        public Integer pageId;

        @NameInMap("PageInfos")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfos> pageInfos;

        @NameInMap("PageTitle")
        public String pageTitle;

        @NameInMap("ParagraphInfo")
        public RecognizeAllTextResponseBodyDataSubImagesParagraphInfo paragraphInfo;

        @NameInMap("PartInfos")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfos> partInfos;

        @NameInMap("QrCodeInfo")
        public RecognizeAllTextResponseBodyDataSubImagesQrCodeInfo qrCodeInfo;

        @NameInMap("QualityInfo")
        public RecognizeAllTextResponseBodyDataSubImagesQualityInfo qualityInfo;

        @NameInMap("RowInfo")
        public RecognizeAllTextResponseBodyDataSubImagesRowInfo rowInfo;

        @NameInMap("StampInfo")
        public RecognizeAllTextResponseBodyDataSubImagesStampInfo stampInfo;

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

        public RecognizeAllTextResponseBodyDataSubImages setDocLayouts(java.util.List<RecognizeAllTextResponseBodyDataSubImagesDocLayouts> docLayouts) {
            this.docLayouts = docLayouts;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesDocLayouts> getDocLayouts() {
            return this.docLayouts;
        }

        public RecognizeAllTextResponseBodyDataSubImages setDocSpecialTexts(java.util.List<RecognizeAllTextResponseBodyDataSubImagesDocSpecialTexts> docSpecialTexts) {
            this.docSpecialTexts = docSpecialTexts;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesDocSpecialTexts> getDocSpecialTexts() {
            return this.docSpecialTexts;
        }

        public RecognizeAllTextResponseBodyDataSubImages setDocSubField(java.util.List<RecognizeAllTextResponseBodyDataSubImagesDocSubField> docSubField) {
            this.docSubField = docSubField;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesDocSubField> getDocSubField() {
            return this.docSubField;
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

        public RecognizeAllTextResponseBodyDataSubImages setMathInfos(java.util.List<RecognizeAllTextResponseBodyDataSubImagesMathInfos> mathInfos) {
            this.mathInfos = mathInfos;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesMathInfos> getMathInfos() {
            return this.mathInfos;
        }

        public RecognizeAllTextResponseBodyDataSubImages setNewStyleData(RecognizeAllTextResponseBodyDataSubImagesNewStyleData newStyleData) {
            this.newStyleData = newStyleData;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesNewStyleData getNewStyleData() {
            return this.newStyleData;
        }

        public RecognizeAllTextResponseBodyDataSubImages setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public RecognizeAllTextResponseBodyDataSubImages setPageInfos(java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfos> pageInfos) {
            this.pageInfos = pageInfos;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPageInfos> getPageInfos() {
            return this.pageInfos;
        }

        public RecognizeAllTextResponseBodyDataSubImages setPageTitle(String pageTitle) {
            this.pageTitle = pageTitle;
            return this;
        }
        public String getPageTitle() {
            return this.pageTitle;
        }

        public RecognizeAllTextResponseBodyDataSubImages setParagraphInfo(RecognizeAllTextResponseBodyDataSubImagesParagraphInfo paragraphInfo) {
            this.paragraphInfo = paragraphInfo;
            return this;
        }
        public RecognizeAllTextResponseBodyDataSubImagesParagraphInfo getParagraphInfo() {
            return this.paragraphInfo;
        }

        public RecognizeAllTextResponseBodyDataSubImages setPartInfos(java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfos> partInfos) {
            this.partInfos = partInfos;
            return this;
        }
        public java.util.List<RecognizeAllTextResponseBodyDataSubImagesPartInfos> getPartInfos() {
            return this.partInfos;
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

        @NameInMap("AlgoVersion")
        public String algoVersion;

        @NameInMap("Content")
        public String content;

        @NameInMap("DebugInfo")
        public Object debugInfo;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("IsMixedMode")
        public Boolean isMixedMode;

        @NameInMap("KvExcelUrl")
        public String kvExcelUrl;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("SubImageCount")
        public Integer subImageCount;

        @NameInMap("SubImages")
        public java.util.List<RecognizeAllTextResponseBodyDataSubImages> subImages;

        @NameInMap("Width")
        public Integer width;

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
