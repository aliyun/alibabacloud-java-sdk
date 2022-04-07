// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class CSVInput extends TeaModel {
    // description
    @NameInMap("AllowQuotedRecordDelimiter")
    public Boolean allowQuotedRecordDelimiter;

    // description
    @NameInMap("CommentCharacter")
    public String commentCharacter;

    // description
    @NameInMap("FieldDelimiter")
    public String fieldDelimiter;

    @NameInMap("FileHeaderInfo")
    public String fileHeaderInfo;

    // description
    @NameInMap("QuoteCharacter")
    public String quoteCharacter;

    // description
    @NameInMap("Range")
    public String range;

    // description
    @NameInMap("RecordDelimiter")
    public String recordDelimiter;

    public static CSVInput build(java.util.Map<String, ?> map) throws Exception {
        CSVInput self = new CSVInput();
        return TeaModel.build(map, self);
    }

    public CSVInput setAllowQuotedRecordDelimiter(Boolean allowQuotedRecordDelimiter) {
        this.allowQuotedRecordDelimiter = allowQuotedRecordDelimiter;
        return this;
    }
    public Boolean getAllowQuotedRecordDelimiter() {
        return this.allowQuotedRecordDelimiter;
    }

    public CSVInput setCommentCharacter(String commentCharacter) {
        this.commentCharacter = commentCharacter;
        return this;
    }
    public String getCommentCharacter() {
        return this.commentCharacter;
    }

    public CSVInput setFieldDelimiter(String fieldDelimiter) {
        this.fieldDelimiter = fieldDelimiter;
        return this;
    }
    public String getFieldDelimiter() {
        return this.fieldDelimiter;
    }

    public CSVInput setFileHeaderInfo(String fileHeaderInfo) {
        this.fileHeaderInfo = fileHeaderInfo;
        return this;
    }
    public String getFileHeaderInfo() {
        return this.fileHeaderInfo;
    }

    public CSVInput setQuoteCharacter(String quoteCharacter) {
        this.quoteCharacter = quoteCharacter;
        return this;
    }
    public String getQuoteCharacter() {
        return this.quoteCharacter;
    }

    public CSVInput setRange(String range) {
        this.range = range;
        return this;
    }
    public String getRange() {
        return this.range;
    }

    public CSVInput setRecordDelimiter(String recordDelimiter) {
        this.recordDelimiter = recordDelimiter;
        return this;
    }
    public String getRecordDelimiter() {
        return this.recordDelimiter;
    }

}
