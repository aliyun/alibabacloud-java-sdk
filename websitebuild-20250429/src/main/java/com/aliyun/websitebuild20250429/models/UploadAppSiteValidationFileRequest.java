// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UploadAppSiteValidationFileRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>yjdw.bpu.edu.cn-waf</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;URI\&quot;: \&quot;oss://imm-test-co-cn-chengdu/zqh/input/Image/indexImage/nn1.jpg\&quot;, \&quot;LatLong\&quot;:\&quot;+39.998800,+116.480900\&quot;}</p>
     */
    @NameInMap("File")
    public String file;

    /**
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("FileContent")
    public String fileContent;

    /**
     * <strong>example:</strong>
     * <p>APP_MAPPING</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("SiteHost")
    public String siteHost;

    public static UploadAppSiteValidationFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAppSiteValidationFileRequest self = new UploadAppSiteValidationFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadAppSiteValidationFileRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UploadAppSiteValidationFileRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UploadAppSiteValidationFileRequest setFile(String file) {
        this.file = file;
        return this;
    }
    public String getFile() {
        return this.file;
    }

    public UploadAppSiteValidationFileRequest setFileContent(String fileContent) {
        this.fileContent = fileContent;
        return this;
    }
    public String getFileContent() {
        return this.fileContent;
    }

    public UploadAppSiteValidationFileRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public UploadAppSiteValidationFileRequest setSiteHost(String siteHost) {
        this.siteHost = siteHost;
        return this;
    }
    public String getSiteHost() {
        return this.siteHost;
    }

}
