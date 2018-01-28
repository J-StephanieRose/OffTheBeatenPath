/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeoTrot.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author kolobj
 */
@Entity
public class Tag {

    private static final long serialVersionUID = 1L;

    public enum TagType {
        Modified,
        Unmodified,
        Offline
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected TagType tagType;

    public Tag() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.tagType = TagType.Modified;
    }

    public Tag(Long id, String name, TagType tagType) {
        this.id = id;
        this.title = name;
        this.tagType = tagType;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", tagType=" + this.tagType + " ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * @return the name
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the name to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the tagType
     */
    public TagType getTagType() {
        return tagType;
    }

    /**
     * @param tagType the tagType to set
     */
    public void setTagType(TagType tagType) {
        this.tagType = tagType;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

}
