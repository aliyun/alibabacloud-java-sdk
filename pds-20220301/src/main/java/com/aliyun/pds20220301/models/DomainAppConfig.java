// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class DomainAppConfig extends TeaModel {
    @NameInMap("allow_upload_custom_file_ext_list")
    public java.util.List<String> allowUploadCustomFileExtList;

    @NameInMap("allow_upload_file_category_list")
    public java.util.List<String> allowUploadFileCategoryList;

    @NameInMap("same_name_file_upload_mode")
    public String sameNameFileUploadMode;

    @NameInMap("single_file_upload_size_limit")
    public Long singleFileUploadSizeLimit;

    @NameInMap("web_client_download_mode")
    public String webClientDownloadMode;

    public static DomainAppConfig build(java.util.Map<String, ?> map) throws Exception {
        DomainAppConfig self = new DomainAppConfig();
        return TeaModel.build(map, self);
    }

    public DomainAppConfig setAllowUploadCustomFileExtList(java.util.List<String> allowUploadCustomFileExtList) {
        this.allowUploadCustomFileExtList = allowUploadCustomFileExtList;
        return this;
    }
    public java.util.List<String> getAllowUploadCustomFileExtList() {
        return this.allowUploadCustomFileExtList;
    }

    public DomainAppConfig setAllowUploadFileCategoryList(java.util.List<String> allowUploadFileCategoryList) {
        this.allowUploadFileCategoryList = allowUploadFileCategoryList;
        return this;
    }
    public java.util.List<String> getAllowUploadFileCategoryList() {
        return this.allowUploadFileCategoryList;
    }

    public DomainAppConfig setSameNameFileUploadMode(String sameNameFileUploadMode) {
        this.sameNameFileUploadMode = sameNameFileUploadMode;
        return this;
    }
    public String getSameNameFileUploadMode() {
        return this.sameNameFileUploadMode;
    }

    public DomainAppConfig setSingleFileUploadSizeLimit(Long singleFileUploadSizeLimit) {
        this.singleFileUploadSizeLimit = singleFileUploadSizeLimit;
        return this;
    }
    public Long getSingleFileUploadSizeLimit() {
        return this.singleFileUploadSizeLimit;
    }

    public DomainAppConfig setWebClientDownloadMode(String webClientDownloadMode) {
        this.webClientDownloadMode = webClientDownloadMode;
        return this;
    }
    public String getWebClientDownloadMode() {
        return this.webClientDownloadMode;
    }

}
