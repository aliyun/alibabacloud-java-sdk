// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CreateExperienceDataRequest extends TeaModel {
    /**
     * <p>The data content type. Valid values:</p>
     * <ul>
     * <li>pdf</li>
     * <li>text</li>
     * <li>html</li>
     * <li>doc.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("contentType")
    public String contentType;

    /**
     * <p>The data size.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("dataSize")
    public Long dataSize;

    /**
     * <p>The data type. Valid values:</p>
     * <ul>
     * <li>file: file</li>
     * <li>url: URL.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>file</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <p>The data content.</p>
     * <ul>
     * <li>If dataType is set to file, this field specifies the OSS address of the file.</li>
     * <li>If dataType is set to url, this field specifies the HTTP URL of the data.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx">https://xxx</a></p>
     */
    @NameInMap("dataValue")
    public String dataValue;

    /**
     * <p>The data name. This parameter is required when dataType is set to file.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The service type.</p>
     * 
     * <strong>example:</strong>
     * <p>document-analyze</p>
     */
    @NameInMap("serviceType")
    public String serviceType;

    /**
     * <p>Specifies whether to perform a dry run request.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateExperienceDataRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExperienceDataRequest self = new CreateExperienceDataRequest();
        return TeaModel.build(map, self);
    }

    public CreateExperienceDataRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public CreateExperienceDataRequest setDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Long getDataSize() {
        return this.dataSize;
    }

    public CreateExperienceDataRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateExperienceDataRequest setDataValue(String dataValue) {
        this.dataValue = dataValue;
        return this;
    }
    public String getDataValue() {
        return this.dataValue;
    }

    public CreateExperienceDataRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateExperienceDataRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public CreateExperienceDataRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
