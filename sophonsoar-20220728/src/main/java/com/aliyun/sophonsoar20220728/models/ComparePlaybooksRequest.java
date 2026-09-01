// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ComparePlaybooksRequest extends TeaModel {
    /**
     * <p>The language of the request and response.</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UUID of the second published version for comparison.</p>
     * <blockquote>
     * <p>To obtain the UUID of a historical version, call the <a href="~~DescribePlaybookReleases~~">DescribePlaybookReleases</a> operation. The system automatically generates a UUID for a new version.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sfdf2395-e814-459f-9662-xxxxx</p>
     */
    @NameInMap("NewPlaybookReleaseId")
    public Integer newPlaybookReleaseId;

    /**
     * <p>The UUID of the first published version for comparison.</p>
     * <blockquote>
     * <p>To obtain the UUID of a historical version, call the <a href="~~DescribePlaybookReleases~~">DescribePlaybookReleases</a> operation. The system automatically generates a UUID for a new version.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sflk23423-e814-459f-9662-xxxxx</p>
     */
    @NameInMap("OldPlaybookReleaseId")
    public Integer oldPlaybookReleaseId;

    /**
     * <p>The UUID of the playbook.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f916b93e-e814-459f-9662-xxxxx</p>
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
