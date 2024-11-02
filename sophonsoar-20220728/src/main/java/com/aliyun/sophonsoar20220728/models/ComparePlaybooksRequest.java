// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ComparePlaybooksRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UUID of the second version.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribePopApiVersionList~~">DescribePopApiVersionList</a> operation to query the UUIDs of versions.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sfdf2395-e814-459f-9662-xxxxx</p>
     */
    @NameInMap("NewPlaybookReleaseId")
    public Integer newPlaybookReleaseId;

    /**
     * <p>The UUID of the first version.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribePopApiVersionList~~">DescribePopApiVersionList</a> operation to query the UUIDs of versions.</p>
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
     * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a>operation to query the UUIDs of playbooks.</p>
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
