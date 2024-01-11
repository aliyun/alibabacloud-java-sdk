// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckSummaryRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The account ID of the resource directory.</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public String resourceDirectoryAccountId;

    /**
     * <p>The service provider (SP) of the cloud asset.</p>
     */
    @NameInMap("Vendors")
    public java.util.List<String> vendors;

    public static GetCheckSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckSummaryRequest self = new GetCheckSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckSummaryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetCheckSummaryRequest setResourceDirectoryAccountId(String resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public String getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public GetCheckSummaryRequest setVendors(java.util.List<String> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<String> getVendors() {
        return this.vendors;
    }

}
