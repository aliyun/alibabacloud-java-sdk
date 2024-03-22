// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ComparePlaybooksRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh** (default): Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UUID of the second version.</p>
     * <br>
     * <p>>  You can call the [DescribePopApiVersionList](~~DescribePopApiVersionList~~) operation to query the UUIDs of versions.</p>
     */
    @NameInMap("NewPlaybookReleaseId")
    public Integer newPlaybookReleaseId;

    /**
     * <p>The UUID of the first version.</p>
     * <br>
     * <p>>  You can call the [DescribePopApiVersionList](~~DescribePopApiVersionList~~) operation to query the UUIDs of versions.</p>
     */
    @NameInMap("OldPlaybookReleaseId")
    public Integer oldPlaybookReleaseId;

    /**
     * <p>The UUID of the playbook.</p>
     * <br>
     * <p>>  You can call the [DescribePlaybooks](~~DescribePlaybooks~~)operation to query the UUIDs of playbooks.</p>
     */
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
