// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SearchSampleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <strong>example:</strong>
     * <p>INTERNET</p>
     */
    @NameInMap("Tab")
    public String tab;

    /**
     * <strong>example:</strong>
     * <p>SAF_CONSOLE</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>2023-03-09 14:45:26</p>
     */
    @NameInMap("UploadTimeEnd")
    public String uploadTimeEnd;

    /**
     * <strong>example:</strong>
     * <p>2023-02-09 14:12:12</p>
     */
    @NameInMap("UploadTimeStart")
    public String uploadTimeStart;

    public static SearchSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchSampleRequest self = new SearchSampleRequest();
        return TeaModel.build(map, self);
    }

    public SearchSampleRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public SearchSampleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SearchSampleRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public SearchSampleRequest setTab(String tab) {
        this.tab = tab;
        return this;
    }
    public String getTab() {
        return this.tab;
    }

    public SearchSampleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SearchSampleRequest setUploadTimeEnd(String uploadTimeEnd) {
        this.uploadTimeEnd = uploadTimeEnd;
        return this;
    }
    public String getUploadTimeEnd() {
        return this.uploadTimeEnd;
    }

    public SearchSampleRequest setUploadTimeStart(String uploadTimeStart) {
        this.uploadTimeStart = uploadTimeStart;
        return this;
    }
    public String getUploadTimeStart() {
        return this.uploadTimeStart;
    }

}
