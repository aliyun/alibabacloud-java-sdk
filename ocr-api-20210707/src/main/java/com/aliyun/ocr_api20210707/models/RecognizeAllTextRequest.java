// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeAllTextRequest extends TeaModel {
    @NameInMap("AdvancedConfig")
    public RecognizeAllTextRequestAdvancedConfig advancedConfig;

    @NameInMap("IdCardConfig")
    public RecognizeAllTextRequestIdCardConfig idCardConfig;

    @NameInMap("InternationalBusinessLicenseConfig")
    public RecognizeAllTextRequestInternationalBusinessLicenseConfig internationalBusinessLicenseConfig;

    @NameInMap("InternationalIdCardConfig")
    public RecognizeAllTextRequestInternationalIdCardConfig internationalIdCardConfig;

    @NameInMap("MultiLanConfig")
    public RecognizeAllTextRequestMultiLanConfig multiLanConfig;

    @NameInMap("OutputBarCode")
    public Boolean outputBarCode;

    @NameInMap("OutputCoordinate")
    public String outputCoordinate;

    @NameInMap("OutputFigure")
    public Boolean outputFigure;

    @NameInMap("OutputKVExcel")
    public Boolean outputKVExcel;

    @NameInMap("OutputOricoord")
    public Boolean outputOricoord;

    @NameInMap("OutputQrcode")
    public Boolean outputQrcode;

    @NameInMap("OutputStamp")
    public Boolean outputStamp;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("TableConfig")
    public RecognizeAllTextRequestTableConfig tableConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeAllTextRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeAllTextRequest self = new RecognizeAllTextRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeAllTextRequest setAdvancedConfig(RecognizeAllTextRequestAdvancedConfig advancedConfig) {
        this.advancedConfig = advancedConfig;
        return this;
    }
    public RecognizeAllTextRequestAdvancedConfig getAdvancedConfig() {
        return this.advancedConfig;
    }

    public RecognizeAllTextRequest setIdCardConfig(RecognizeAllTextRequestIdCardConfig idCardConfig) {
        this.idCardConfig = idCardConfig;
        return this;
    }
    public RecognizeAllTextRequestIdCardConfig getIdCardConfig() {
        return this.idCardConfig;
    }

    public RecognizeAllTextRequest setInternationalBusinessLicenseConfig(RecognizeAllTextRequestInternationalBusinessLicenseConfig internationalBusinessLicenseConfig) {
        this.internationalBusinessLicenseConfig = internationalBusinessLicenseConfig;
        return this;
    }
    public RecognizeAllTextRequestInternationalBusinessLicenseConfig getInternationalBusinessLicenseConfig() {
        return this.internationalBusinessLicenseConfig;
    }

    public RecognizeAllTextRequest setInternationalIdCardConfig(RecognizeAllTextRequestInternationalIdCardConfig internationalIdCardConfig) {
        this.internationalIdCardConfig = internationalIdCardConfig;
        return this;
    }
    public RecognizeAllTextRequestInternationalIdCardConfig getInternationalIdCardConfig() {
        return this.internationalIdCardConfig;
    }

    public RecognizeAllTextRequest setMultiLanConfig(RecognizeAllTextRequestMultiLanConfig multiLanConfig) {
        this.multiLanConfig = multiLanConfig;
        return this;
    }
    public RecognizeAllTextRequestMultiLanConfig getMultiLanConfig() {
        return this.multiLanConfig;
    }

    public RecognizeAllTextRequest setOutputBarCode(Boolean outputBarCode) {
        this.outputBarCode = outputBarCode;
        return this;
    }
    public Boolean getOutputBarCode() {
        return this.outputBarCode;
    }

    public RecognizeAllTextRequest setOutputCoordinate(String outputCoordinate) {
        this.outputCoordinate = outputCoordinate;
        return this;
    }
    public String getOutputCoordinate() {
        return this.outputCoordinate;
    }

    public RecognizeAllTextRequest setOutputFigure(Boolean outputFigure) {
        this.outputFigure = outputFigure;
        return this;
    }
    public Boolean getOutputFigure() {
        return this.outputFigure;
    }

    public RecognizeAllTextRequest setOutputKVExcel(Boolean outputKVExcel) {
        this.outputKVExcel = outputKVExcel;
        return this;
    }
    public Boolean getOutputKVExcel() {
        return this.outputKVExcel;
    }

    public RecognizeAllTextRequest setOutputOricoord(Boolean outputOricoord) {
        this.outputOricoord = outputOricoord;
        return this;
    }
    public Boolean getOutputOricoord() {
        return this.outputOricoord;
    }

    public RecognizeAllTextRequest setOutputQrcode(Boolean outputQrcode) {
        this.outputQrcode = outputQrcode;
        return this;
    }
    public Boolean getOutputQrcode() {
        return this.outputQrcode;
    }

    public RecognizeAllTextRequest setOutputStamp(Boolean outputStamp) {
        this.outputStamp = outputStamp;
        return this;
    }
    public Boolean getOutputStamp() {
        return this.outputStamp;
    }

    public RecognizeAllTextRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public RecognizeAllTextRequest setTableConfig(RecognizeAllTextRequestTableConfig tableConfig) {
        this.tableConfig = tableConfig;
        return this;
    }
    public RecognizeAllTextRequestTableConfig getTableConfig() {
        return this.tableConfig;
    }

    public RecognizeAllTextRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public RecognizeAllTextRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeAllTextRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

    public static class RecognizeAllTextRequestAdvancedConfig extends TeaModel {
        @NameInMap("IsHandWritingTable")
        public Boolean isHandWritingTable;

        @NameInMap("IsLineLessTable")
        public Boolean isLineLessTable;

        @NameInMap("OutputCharInfo")
        public Boolean outputCharInfo;

        @NameInMap("OutputParagraph")
        public Boolean outputParagraph;

        @NameInMap("OutputRow")
        public Boolean outputRow;

        @NameInMap("OutputTable")
        public Boolean outputTable;

        @NameInMap("OutputTableExcel")
        public Boolean outputTableExcel;

        @NameInMap("OutputTableHtml")
        public Boolean outputTableHtml;

        public static RecognizeAllTextRequestAdvancedConfig build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextRequestAdvancedConfig self = new RecognizeAllTextRequestAdvancedConfig();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextRequestAdvancedConfig setIsHandWritingTable(Boolean isHandWritingTable) {
            this.isHandWritingTable = isHandWritingTable;
            return this;
        }
        public Boolean getIsHandWritingTable() {
            return this.isHandWritingTable;
        }

        public RecognizeAllTextRequestAdvancedConfig setIsLineLessTable(Boolean isLineLessTable) {
            this.isLineLessTable = isLineLessTable;
            return this;
        }
        public Boolean getIsLineLessTable() {
            return this.isLineLessTable;
        }

        public RecognizeAllTextRequestAdvancedConfig setOutputCharInfo(Boolean outputCharInfo) {
            this.outputCharInfo = outputCharInfo;
            return this;
        }
        public Boolean getOutputCharInfo() {
            return this.outputCharInfo;
        }

        public RecognizeAllTextRequestAdvancedConfig setOutputParagraph(Boolean outputParagraph) {
            this.outputParagraph = outputParagraph;
            return this;
        }
        public Boolean getOutputParagraph() {
            return this.outputParagraph;
        }

        public RecognizeAllTextRequestAdvancedConfig setOutputRow(Boolean outputRow) {
            this.outputRow = outputRow;
            return this;
        }
        public Boolean getOutputRow() {
            return this.outputRow;
        }

        public RecognizeAllTextRequestAdvancedConfig setOutputTable(Boolean outputTable) {
            this.outputTable = outputTable;
            return this;
        }
        public Boolean getOutputTable() {
            return this.outputTable;
        }

        public RecognizeAllTextRequestAdvancedConfig setOutputTableExcel(Boolean outputTableExcel) {
            this.outputTableExcel = outputTableExcel;
            return this;
        }
        public Boolean getOutputTableExcel() {
            return this.outputTableExcel;
        }

        public RecognizeAllTextRequestAdvancedConfig setOutputTableHtml(Boolean outputTableHtml) {
            this.outputTableHtml = outputTableHtml;
            return this;
        }
        public Boolean getOutputTableHtml() {
            return this.outputTableHtml;
        }

    }

    public static class RecognizeAllTextRequestIdCardConfig extends TeaModel {
        @NameInMap("OutputIdCardQuality")
        public Boolean outputIdCardQuality;

        public static RecognizeAllTextRequestIdCardConfig build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextRequestIdCardConfig self = new RecognizeAllTextRequestIdCardConfig();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextRequestIdCardConfig setOutputIdCardQuality(Boolean outputIdCardQuality) {
            this.outputIdCardQuality = outputIdCardQuality;
            return this;
        }
        public Boolean getOutputIdCardQuality() {
            return this.outputIdCardQuality;
        }

    }

    public static class RecognizeAllTextRequestInternationalBusinessLicenseConfig extends TeaModel {
        @NameInMap("Country")
        public String country;

        public static RecognizeAllTextRequestInternationalBusinessLicenseConfig build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextRequestInternationalBusinessLicenseConfig self = new RecognizeAllTextRequestInternationalBusinessLicenseConfig();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextRequestInternationalBusinessLicenseConfig setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

    }

    public static class RecognizeAllTextRequestInternationalIdCardConfig extends TeaModel {
        @NameInMap("Country")
        public String country;

        public static RecognizeAllTextRequestInternationalIdCardConfig build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextRequestInternationalIdCardConfig self = new RecognizeAllTextRequestInternationalIdCardConfig();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextRequestInternationalIdCardConfig setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

    }

    public static class RecognizeAllTextRequestMultiLanConfig extends TeaModel {
        @NameInMap("Languages")
        public String languages;

        public static RecognizeAllTextRequestMultiLanConfig build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextRequestMultiLanConfig self = new RecognizeAllTextRequestMultiLanConfig();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextRequestMultiLanConfig setLanguages(String languages) {
            this.languages = languages;
            return this;
        }
        public String getLanguages() {
            return this.languages;
        }

    }

    public static class RecognizeAllTextRequestTableConfig extends TeaModel {
        @NameInMap("IsHandWritingTable")
        public Boolean isHandWritingTable;

        @NameInMap("IsLineLessTable")
        public Boolean isLineLessTable;

        @NameInMap("OutputTableExcel")
        public Boolean outputTableExcel;

        @NameInMap("OutputTableHtml")
        public Boolean outputTableHtml;

        public static RecognizeAllTextRequestTableConfig build(java.util.Map<String, ?> map) throws Exception {
            RecognizeAllTextRequestTableConfig self = new RecognizeAllTextRequestTableConfig();
            return TeaModel.build(map, self);
        }

        public RecognizeAllTextRequestTableConfig setIsHandWritingTable(Boolean isHandWritingTable) {
            this.isHandWritingTable = isHandWritingTable;
            return this;
        }
        public Boolean getIsHandWritingTable() {
            return this.isHandWritingTable;
        }

        public RecognizeAllTextRequestTableConfig setIsLineLessTable(Boolean isLineLessTable) {
            this.isLineLessTable = isLineLessTable;
            return this;
        }
        public Boolean getIsLineLessTable() {
            return this.isLineLessTable;
        }

        public RecognizeAllTextRequestTableConfig setOutputTableExcel(Boolean outputTableExcel) {
            this.outputTableExcel = outputTableExcel;
            return this;
        }
        public Boolean getOutputTableExcel() {
            return this.outputTableExcel;
        }

        public RecognizeAllTextRequestTableConfig setOutputTableHtml(Boolean outputTableHtml) {
            this.outputTableHtml = outputTableHtml;
            return this;
        }
        public Boolean getOutputTableHtml() {
            return this.outputTableHtml;
        }

    }

}
