// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SearchSampleRequest extends TeaModel {
    /**
     * <p>The domain name keyword provided.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language of error messages returned by the API. Valid values: zh: Chinese. en: English. Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The area encoding.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <p>The scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>INTERNET</p>
     */
    @NameInMap("Tab")
    public String tab;

    /**
     * <p>The access type.</p>
     * 
     * <strong>example:</strong>
     * <p>SAF_CONSOLE</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The upload end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-09 14:45:26</p>
     */
    @NameInMap("UploadTimeEnd")
    public String uploadTimeEnd;

    /**
     * <p>The upload start time.</p>
     * 
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
