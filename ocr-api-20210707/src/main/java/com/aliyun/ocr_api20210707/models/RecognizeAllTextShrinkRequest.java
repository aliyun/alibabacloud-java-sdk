// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeAllTextShrinkRequest extends TeaModel {
    @NameInMap("AdvancedConfig")
    public String advancedConfigShrink;

    @NameInMap("IdCardConfig")
    public String idCardConfigShrink;

    @NameInMap("InternationalBusinessLicenseConfig")
    public String internationalBusinessLicenseConfigShrink;

    @NameInMap("InternationalIdCardConfig")
    public String internationalIdCardConfigShrink;

    @NameInMap("MultiLanConfig")
    public String multiLanConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OutputBarCode")
    public Boolean outputBarCode;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OutputCoordinate")
    public String outputCoordinate;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("OutputFigure")
    public Boolean outputFigure;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OutputKVExcel")
    public Boolean outputKVExcel;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OutputOricoord")
    public Boolean outputOricoord;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("OutputQrcode")
    public Boolean outputQrcode;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("OutputStamp")
    public Boolean outputStamp;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("TableConfig")
    public String tableConfigShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Advanced</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p><a href="https://example.png">https://example.png</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeAllTextShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeAllTextShrinkRequest self = new RecognizeAllTextShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeAllTextShrinkRequest setAdvancedConfigShrink(String advancedConfigShrink) {
        this.advancedConfigShrink = advancedConfigShrink;
        return this;
    }
    public String getAdvancedConfigShrink() {
        return this.advancedConfigShrink;
    }

    public RecognizeAllTextShrinkRequest setIdCardConfigShrink(String idCardConfigShrink) {
        this.idCardConfigShrink = idCardConfigShrink;
        return this;
    }
    public String getIdCardConfigShrink() {
        return this.idCardConfigShrink;
    }

    public RecognizeAllTextShrinkRequest setInternationalBusinessLicenseConfigShrink(String internationalBusinessLicenseConfigShrink) {
        this.internationalBusinessLicenseConfigShrink = internationalBusinessLicenseConfigShrink;
        return this;
    }
    public String getInternationalBusinessLicenseConfigShrink() {
        return this.internationalBusinessLicenseConfigShrink;
    }

    public RecognizeAllTextShrinkRequest setInternationalIdCardConfigShrink(String internationalIdCardConfigShrink) {
        this.internationalIdCardConfigShrink = internationalIdCardConfigShrink;
        return this;
    }
    public String getInternationalIdCardConfigShrink() {
        return this.internationalIdCardConfigShrink;
    }

    public RecognizeAllTextShrinkRequest setMultiLanConfigShrink(String multiLanConfigShrink) {
        this.multiLanConfigShrink = multiLanConfigShrink;
        return this;
    }
    public String getMultiLanConfigShrink() {
        return this.multiLanConfigShrink;
    }

    public RecognizeAllTextShrinkRequest setOutputBarCode(Boolean outputBarCode) {
        this.outputBarCode = outputBarCode;
        return this;
    }
    public Boolean getOutputBarCode() {
        return this.outputBarCode;
    }

    public RecognizeAllTextShrinkRequest setOutputCoordinate(String outputCoordinate) {
        this.outputCoordinate = outputCoordinate;
        return this;
    }
    public String getOutputCoordinate() {
        return this.outputCoordinate;
    }

    public RecognizeAllTextShrinkRequest setOutputFigure(Boolean outputFigure) {
        this.outputFigure = outputFigure;
        return this;
    }
    public Boolean getOutputFigure() {
        return this.outputFigure;
    }

    public RecognizeAllTextShrinkRequest setOutputKVExcel(Boolean outputKVExcel) {
        this.outputKVExcel = outputKVExcel;
        return this;
    }
    public Boolean getOutputKVExcel() {
        return this.outputKVExcel;
    }

    public RecognizeAllTextShrinkRequest setOutputOricoord(Boolean outputOricoord) {
        this.outputOricoord = outputOricoord;
        return this;
    }
    public Boolean getOutputOricoord() {
        return this.outputOricoord;
    }

    public RecognizeAllTextShrinkRequest setOutputQrcode(Boolean outputQrcode) {
        this.outputQrcode = outputQrcode;
        return this;
    }
    public Boolean getOutputQrcode() {
        return this.outputQrcode;
    }

    public RecognizeAllTextShrinkRequest setOutputStamp(Boolean outputStamp) {
        this.outputStamp = outputStamp;
        return this;
    }
    public Boolean getOutputStamp() {
        return this.outputStamp;
    }

    public RecognizeAllTextShrinkRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public RecognizeAllTextShrinkRequest setTableConfigShrink(String tableConfigShrink) {
        this.tableConfigShrink = tableConfigShrink;
        return this;
    }
    public String getTableConfigShrink() {
        return this.tableConfigShrink;
    }

    public RecognizeAllTextShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public RecognizeAllTextShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeAllTextShrinkRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
