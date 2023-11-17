// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ComparePlaybooksRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("NewPlaybookReleaseId")
    public Integer newPlaybookReleaseId;

    @NameInMap("OldPlaybookReleaseId")
    public Integer oldPlaybookReleaseId;

    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    public static ComparePlaybooksRequest build(java.util.Map<String, ?> map) throws Exception {
        ComparePlaybooksRequest self = new ComparePlaybooksRequest();
        return TeaModel.build(map, self);
    }

    public ComparePlaybooksRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ComparePlaybooksRequest setNewPlaybookReleaseId(Integer newPlaybookReleaseId) {
        this.newPlaybookReleaseId = newPlaybookReleaseId;
        return this;
    }
    public Integer getNewPlaybookReleaseId() {
        return this.newPlaybookReleaseId;
    }

    public ComparePlaybooksRequest setOldPlaybookReleaseId(Integer oldPlaybookReleaseId) {
        this.oldPlaybookReleaseId = oldPlaybookReleaseId;
        return this;
    }
    public Integer getOldPlaybookReleaseId() {
        return this.oldPlaybookReleaseId;
    }

    public ComparePlaybooksRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

}
